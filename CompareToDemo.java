package com.collection;
import java.util.*;


	

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	
	public int comparTo(Movie m)
	{
		return this.year -m.year;
	}
	public Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
		
	}
	public double getRating()
	{
		return rating;
	}
	public String getName() {return name;}
	public int getYear() {return year;}
}

class RatingCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		if(m1.getRating() < m2.getRating())return -1;
		if(m1.getRating() > m2.getRating())return 1;
		
		else return 0;
	}
	

}


class NameCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}



public class CompareToDemo {

	public static void main(String[] args) 
	{
		ArrayList<Movie>list = new ArrayList<Movie>();
		
		list.add(new Movie("Jawan",9.8,2023));
		list.add(new Movie("Raja",9.3,2023));
		list.add(new Movie("Kedarnath",10.0,2023));
		list.add(new Movie("HalfGf",8,2023));
		
		System.out.println("Sorted by rating");
		
		RatingCompare rtobj = new RatingCompare();
		Collection.sort(list,rtobj);
		
		for(Movie movie : list)
		{
			System.out.println(movie.getName()+" "+ movie.getRating()+" "+movie.getYear());
		}
		
System.out.println("Sorted by Name");
		
		NameCompare nmobj = new NameCompare();
		Collection.sort(list,nmobj);
		
		for(Movie movie : list)
		{
			System.out.println(movie.getName()+" "+ movie.getRating()+" "+movie.getYear());
		}
		
System.out.println("Sorted by Year");
		
		
		Collection.sort(list,nmobj);
		
		for(Movie movie : list)
		{
			System.out.println(movie.getName()+" "+ movie.getRating()+" "+movie.getYear());
		}

	}

}
