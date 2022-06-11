import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	
	public Code(String sectionNo, String courseName) {
		this.sectionNo = sectionNo;
		this.lectureNo = courseName;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(Code o) {
		String code1 = getSectionNo().concat(getLectureNo());
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2); //concatenating SectionNo and LectionNo then comparing the strings.
	}
	
}

public class Maps {

	public static void main(String[] args) {
		
		Map<Code,String> lecture = new TreeMap<>(); 
		
		lecture.put(new Code("S01","L01"), "PHYSICS");
		lecture.put(new Code("S01","L02"), "CHEM");
		lecture.put(new Code("S02","L01"), "NETWORKS");
		lecture.put(new Code("S03","L01"), "BIO");
		lecture.put(new Code("S02","L02"), "MATHS");
		lecture.put(new Code("S03","L02"), "CODING");
	
		
		for(Map.Entry<Code, String> entry: lecture.entrySet()) {
			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
		}
				
		System.out.println(lecture.keySet());
			
	}

}