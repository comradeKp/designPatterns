package com.kpcorp.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String ShopName;
	List<Book> bookList = new ArrayList<>();

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ", bookList=" + bookList + "]";
	}

	public void loadData() {
		for (int i = 0; i < 10; i++) {
			Book b = new Book();
			b.setBookId(i + 1);
			b.setBookName("Book" + (i + 1));
			getBookList().add(b);
		}
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		shop.setShopName(getShopName());
		for (Book b : this.getBookList()) {
			Book book = new Book();
			book.setBookId(b.getBookId());
			book.setBookName(b.getBookName());
			shop.getBookList().add(book);
		}
		return shop;
	}
	
	

}
