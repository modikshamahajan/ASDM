package Faculty;

public class Principal {

	public static void main(String[] args) {
		
		FullTimeFaculty ftp = new FullTimeFaculty();
		ftp.accept();
		ftp.display();
		ftp.calsal();
		
		FullTimeFaculty ftp1 = new FullTimeFaculty();
		ftp1.accept();
		ftp1.display();
		ftp1.calsal();
		
		PartTimeFaculty ptp1 = new PartTimeFaculty();
		ptp1.accept();
		ptp1.display();
		ptp1.calsal1();
		
		PartTimeFaculty ptp2 = new PartTimeFaculty();
		ptp1.accept();
		ptp1.display();
		ptp1.calsal1();
	}
}
