
public class MyDate {
private int dd,mm,yy;
public void initDate() {
	dd=mm=yy=1;
	
}
public void setDate(int d, int m ,int y) {
	this.dd= d;
	mm= m;
	yy = y;
}
public void displayDate(){
	System.out.println("Date "+dd+"/"+mm+"/"+yy);
}
public static void main(String[] args) {
	MyDate d = new MyDate();
	d.initDate();
	d.displayDate();
	d.setDate(10, 12, 2020);
	d.displayDate();
}

}


