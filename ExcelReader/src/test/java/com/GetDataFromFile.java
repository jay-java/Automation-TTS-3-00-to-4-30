package com;

public class GetDataFromFile {
	public static void main(String[] args) {
		ExcellReader e = new ExcellReader("C:\\Users\\jay-pc\\Desktop\\ExcelReader.xlsx", "login");
		int num_of_rows = e.rowCount();
		int num_of_cols = e.colCount();
		String data = e.getData(num_of_rows, num_of_cols);
		System.out.println(data);
	}
}
