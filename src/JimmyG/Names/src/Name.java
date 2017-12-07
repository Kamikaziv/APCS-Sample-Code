
public class Name {
	String first,middle,last;
	public Name(String first, String middle, String last) {
		this.first=first;
		this.middle=middle;
		this.last=last;
	}
	public String getFirst() {
		return first;
	}
	public String getMiddle() {
		return middle;
	}
	public String getLast() {
		return last;
	}
	public String firstMiddleLast() {
		return first+" "+middle+" "+last;
	}
	public String lastFirstMiddle() {
		return last+", "+first+" "+middle;
	}
	public boolean equals(Name otherName) {
		return first.equalsIgnoreCase(otherName.getFirst())&&middle.equalsIgnoreCase(otherName.getMiddle())&&last.equalsIgnoreCase(otherName.getLast());
	}
	public String initials() {
		return first.substring(0,1).concat(middle.substring(0,1)).concat(last.substring(0,1)).toUpperCase();
	}
	public int length() {
		return first.length()+middle.length()+last.length();
	}
}
