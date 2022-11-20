package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;
import com.kh.library.run.LibraryRun;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	// 1.
	private ArrayList<Book> bList = new ArrayList<Book>();

	@Override
	public void addBook(Book nBook) {
		boolean find = true; // flag 변수 : 깃발, 지표..

		for (Book b : bList) { // b = bList.get(index);
			if (b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : " + nBook.getTitle() + " 도서는 이미 소장하고 있어요");
				find = false; // 중복 됐다는 뜻

				break;
			}
		}
		// 중복이 된 경우 find => false;
		if (find == true) { // 중복이 안 됐다는 뜻
			bList.add(nBook);
			System.out.println("도서명 " + nBook.getTitle() + "도서가 추가 됐어요");
		}

		bList.add(nBook); // add는 자바에서 제공하는 메소드

	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book search = new Book();
		for (Book b : bList) { // b = bList.get(indxe)
			if (b.getbNo().equals(bNo)) {
				// 핵심!!
				search = b; // 객체 자체를 넣는 것
			}

		}

		return search; // return 은 sysout 써주쟈
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) { // 자바
		ArrayList<Book> searchList = new ArrayList<Book>();
		for (Book b : bList) {
			if (b.getTitle().contains(title)) {
				searchList.add(b); // bList 사용시 원본이 바뀜
			}
		}
		return searchList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> bookList = new ArrayList<Book>();

		for (Book b : bList) {
			// instanceof
			// 이유 찾기
			if (b instanceof Book) {
				bookList.add(b);
			}

			/*
			 * if(b instanceof Magazine) { continue; // 조건문 탈출 함수 } else { bookList.add(b);
			 * }
			 */
		}

		return bookList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> magazineList = new ArrayList<Book>();
		for (Book b : bList) {
			if (b instanceof Magazine) {
				magazineList.add(b);
			}
		}
		return magazineList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> mList = new ArrayList<Book>();

		for (Book b : bList) {
			if ( ((Magazine) b).getYear() == year) {
				mList.add(b);
			}
		}

		return mList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> pubList = new ArrayList<Book>();
		for (Book b : bList) {
			if (b.getPublisher().contains(publisher)) {
				pubList.add(b);
			}
		}
		return pubList;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> pList = new ArrayList<Book>();
		for (Book b : bList) {
			if (b.getPrice() <= price) {
				pList.add(b);
			}
		}
		return pList;
	}

	@Override
	public int getTotalPrice() {
		int sum = 0;
		for (Book b : bList) {
			sum += b.getPrice();
		}
		return sum;
	}

	@Override
	public int getAvgPrice() {
		int sum = 0;
		int average = 0;
		for (Book b : bList) {
			sum += b.getPrice();
		}
		average = sum / bList.size();
		return average;
	}

}
