package me.osm.gazetteer.search.query;

import java.util.Collection;
import java.util.Map;

public interface Replacer {
	
	public String getPattern();
	
	public Collection<String> replace(String hn);

	public Map<String, Collection<String>> replaceGroups(String hn);

}
