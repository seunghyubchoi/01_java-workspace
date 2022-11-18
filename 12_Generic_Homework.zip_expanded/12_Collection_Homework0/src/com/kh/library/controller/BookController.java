package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;
import com.kh.library.run.LibraryRun;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	// 필드부
	private ArrayList<Book> bList = new ArrayList<>(); // run 에 있는 비 리스트 추가하기, 런 클래스에서 bc 사용!!!

	// 생성자부
	public BookController() {
	}

	@Override
	public void addBook(Book nBook) {
		boolean find = true;
		for (Book b : bList) {
			if (b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : " + nBook.getTitle() + "있어요.");
				find = false;
				break;
			}
		}
		if (find == true) {
			bList.add(nBook);
			System.out.println("도서명 : " + nBook.getTitle() + "추가했어요.");
		}
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {

		Book search = new Book();

		for (Book b : bList) {
			if (search.getbNo().equals(bNo)) {
				search = b;
			}
		}
		return search;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {

		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> search = new ArrayList<Book>();
		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i) instanceof Magazine) {
				continue;
			} else if (bList.get(i) instanceof Book) {
				search = bList.addAl;
			}

		}
		return search;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		return null;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}

}
