package com.mitchellbosecke.benchmark;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;

import com.mitchellbosecke.benchmark.model.Stock1;

import com.adapterj.widget.Link;
import com.adapterj.widget.LinkGroup;
import com.adapterj.widget.SimpleHTMLView;
import com.adapterj.widget.SimpleListAdapter;
import com.adapterj.widget.Text;
import com.adapterj.widget.TextGroup;
import com.adapterj.widget.View;

public class AdapterJ extends BaseBenchmark {

    private SimpleHTMLView view;
    
	@Setup
    public void setup() throws IOException {
        final List<Stock1> list = Stock1.dummyItems();
        
        final SimpleListAdapter<Stock1> adapter = new SimpleListAdapter<Stock1>();
    	adapter.addAllItems(list);
    	
    	int index = 1;
    	for (Stock1 stock1 : list) {
			final TextGroup texts = new TextGroup(1);
			texts.text(0, new Text(Integer.toString(index)));
			adapter.addTextGroup(texts);
			
    		final LinkGroup links = new LinkGroup(1);
    		final String symbol = stock1.getSymbol();
    		links.link(0, new Link(symbol, "/stocks/" + symbol));
    		adapter.addLinkGroup(links);
    		
    		index ++;
    	}
    	
        view = new SimpleHTMLView(false);
        view.loadHTMLResource(new File("templates/stocks.adapterj.html"), "utf-8");
    	view.putAdapter("_list.item", adapter);
    	view.bindAll(View.SERVER_SIDE_BINDING);
    	
    	//final String html = view.toHTMLString();
    	//Log.i("AdapterJ", "HTML: \n" + html);
    }

    @Benchmark
    public String benchmark() throws IOException {

        return view.toHTMLString();
    }
}
