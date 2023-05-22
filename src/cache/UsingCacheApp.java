package cache;

public class UsingCacheApp {
	public static void main(String[] args) {
		Cache cache = new Cache();

		
		cache.addToCache("idea", "Singleton is needed");
		cache = new Cache();
		cache.addToCache("hello", "Hey people");
		cache = new Cache();
        System.out.println(cache.getFromCache("idea")); 
        System.out.println(cache.getFromCache("hello")); 
	}
}
