import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main{
    public static void main(String[]args){    
    	
    	List<Fruit> fru=Arrays.asList(
    			new Fruit("guava",98,45,"orange"),
    			new Fruit("pineapple",102,30,"Yellow"),
    			new Fruit("mango",120,55,"orange"),
    			new Fruit("custardapple",78,34,"saffron"));
    	
    	
    	List<News> news1=Arrays.asList(
    			new News(22,"sai","Asha","new budget list is good"),
    			new News(23,"hemanth","Naga","Finally ipl started"),
    			new News(23,"hemanth","Naga","I support kkr"),
    			new News(24,"mahesh","Narhsa","wbu 12 exam"),
    			new News(22,"sai","Yallesh","without budget list"),
    			new News(23,"hemanth","Naga","ipl india ka festival"));
    	
        Trader tharun = new Trader("arun", "mumbai");
        Trader swetha = new Trader("sujji","vizag");
        Trader giri = new Trader("chakri","mumbai");
        Trader ankan = new Trader("anand","mumbai");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(ankan, 2015, 300), 
            new Transaction(tharun, 2018, 5000),
            new Transaction(tharun, 2015, 400),
            new Transaction(swetha, 2018, 710),	
            new Transaction(swetha, 2018, 700),
            new Transaction(giri, 2018, 950)
        );	
        

		//Displayed the fruit names of low calories fruits i.e. calories < 100 sorted in
		//descending order of calories.
		System.out.println("Acoording to <less calories ");
		fru.stream()
		.filter(t->(t.FruitCalories<100))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t));

		//Display color wise list of fruit names
		System.out.println("\nSort according to color");
		fru.stream()
		.sorted((p1,p2)->p1.FruitColor.compareTo(p2.FruitColor))
		.forEach(System.out::println);
		
		//Display only RED color fruits sorted as per their price in ascending order.
		System.out.println("\nSort orange color fruits sorted withprice in ascending");
		fru.stream()
		.filter(t->t.FruitColor.equals("orange"))
		.forEach(t->System.out.println(t));
		
		//Find out the newsId which has received maximum comments.
		System.out.println("\nnewsId which has received maximum comments");
		int  p=news1.stream()
				.min((p1,p2)-> {
					return (int) p1.getNewsID()+p2.getNewsID();
					}).get().getNewsID();
			 System.out.println(p);
	
		
		 //Find out how many times the word 'budget' arrived in user comments all news.
		        System.out.println("\nthe word 'budget' arrived in user comments ");
		
		news1.stream()
		.filter(t->t.NewsComment.contains("budget"))
		.forEach(t->System.out.println(t));
		
		//Find out which user has posted maximum comments.
		 System.out.println("\nwhich user has posted maximum comments");
	 	String  n=news1.stream()
		.max((p1,p2)-> {
			return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
			}).get().getNewsCommentbyUser();
	
		System.out.println(n);

		//Display commentByUser wise number of comments
		 System.out.println("\ncommentByUser wise number of comments");
		news1.stream()
		.sorted((p1,p2)->p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t.NewsCommentbyUser+"="+t.NewsComment));
		
		
		
		
		
        //Find all transactions from year 2015 and sort them by value (small to high).
        List<Transaction> tr2015 = transactions.stream()
                                               .filter(transaction -> transaction.getYear() == 2015)
                                               .sorted(comparing(Transaction::getValue))
                                               .collect(toList());
        System.out.println(tr2015);
        
        //What are all the unique cities where the traders work?
        List<String> cities = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());
        System.out.println(cities);

        //Find all traders from mumbai and sort them by name.
        
        List<Trader> traders = 
            transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("mumbai"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());
        System.out.println(traders);
        
        
        //Return a string of all traders’ names sorted alphabetically.
        
        String traderStr = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        
        //Are there any trader based in mumbai?
        
        boolean mumbaiBased =
            transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                                            .getCity()
                                                            .equals("mumbai")
                                 );
        System.out.println(mumbaiBased);
        
        //Are there any trader in indore?
        
        boolean indoreBased =
                transactions.stream()
                            .anyMatch(transaction -> transaction.getTrader()
                                                                .getCity()
                                                                .equals("indore")
                                     );
            System.out.println(indoreBased);
        
        //Update all transactions so that the traders from mumbai are set to vizag.
        transactions.stream()
                    .map(Transaction::getTrader)
                    .filter(trader -> trader.getCity().equals("mumbai"))
                    .forEach(trader -> trader.setCity("vizag"));
        System.out.println(transactions);
        
        
        //What's the highest value in all the transactions?
        int highestValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::max);
        System.out.println(highestValue);   
        
        //What's the lowest value in all the transactions?
        int lowestValue = 
                transactions.stream()
                            .map(Transaction::getValue)
                            .reduce(5000, Integer::min);
            System.out.println(lowestValue);      
    }
}
