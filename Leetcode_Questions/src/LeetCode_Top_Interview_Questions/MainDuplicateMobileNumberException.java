package LeetCode_Top_Interview_Questions;






import java.util.Scanner;

class DuplicateMobileNumberException extends Exception {

	public DuplicateMobileNumberException(String message) {
		super("Mobile number and alternate mobile number are same");
	}

}

class ContactDetail {
	private String mobile;
	private String alternateMobile;
	private String landLine;
	private String email;
	private String addres;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public ContactDetail(String mobile, String alternateMobile, String landLine, String email, String addres) {
		super();
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.landLine = landLine;
		this.email = email;
		this.addres = addres;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	public String getLandLine() {
		return landLine;
	}

	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

}

class ContactDetailBO {

	public static void validate(String mobile, String alternateMobile) throws DuplicateMobileNumberException {

		if (mobile.equals(alternateMobile))
			throw new DuplicateMobileNumberException("");
	}

}

class MainDuplicateMobileNumberException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mobile = scanner.nextLine();
		String alternateMobile = scanner.nextLine();
		String landline = scanner.nextLine();
		String email = scanner.next();
		String addres = scanner.next();
		ContactDetail detail = new ContactDetail(mobile, alternateMobile, landline, email, addres);
		try {
			ContactDetailBO.validate(mobile, alternateMobile);
			System.out.println("Correct Details");
		} catch (DuplicateMobileNumberException e) {
			System.out.println("DuplicateMobileNumberException: " + e.getMessage());
		}

	}
}
