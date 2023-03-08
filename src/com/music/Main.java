package com.music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {

		Album alb = new Album("Maya", "Bipul Chettri");
		alb.addSong("Junkeri", 4.31);
		alb.addSong("Maya", 4.37);
		alb.addSong("Syndicate", 3.31);

		alb = new Album("Jhapa", "Sabin Rai");
		alb.addSong("samarpan", 4.0);
		alb.addSong("Maya Jalaima", 4.45);
		alb.addSong("Tmi nai hau", 4.34);

		albums.add(alb);

		LinkedList<Song> playList_1 = new LinkedList();

		albums.get(0).addToPlayList("Junkeri", playList_1);
		albums.get(0).addToPlayList("Maya", playList_1);
		albums.get(0).addToPlayList("samarpan", playList_1);
		albums.get(0).addToPlayList("Maya Jalaima", playList_1);

		play(playList_1);

	}

	private static void play(LinkedList<Song> playList) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		
		if(playList.size() == 0) {
			System.out.println("This playlist have no song");
		}else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		while(!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			
			switch(action) {
			
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;
				
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				}else {
					System.out.println("No song available, reached to the eind of the list");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				}else {
					System.out.println("We are the first song");
					forward = false;
				}
				break;
				
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing" + listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("We are at the start of the list");
					}
				}else {
					if(listIterator.hasNext()) {
						System.out.println("Now Playing" + listIterator.next().toString());
					}else {
						System.out.println("we have reached to the end of the list");
					}
				}
				break;
				
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now Playing " + listIterator.next().toString());
					}else {
						if(listIterator.hasPrevious())
						System.out.println("Now playing " + listIterator.previous().toString());
					}
				}
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available option\n press");
		System.out.println("0 - to quit\n" + "1 - to play next song\n" + "2 - to play previous song\n"
				+ "3 - to replay the current song\n" + "4 - list all of the song\n" + "5 - print all availabe options\n"
				+ "6 - delete current song");
	}

	private static void printList(LinkedList<Song> PlayList) {
		Iterator<Song> iterator = PlayList.iterator();
		System.out.println("-------------------------------");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------------------------");
	}

}
