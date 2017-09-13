import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	
		return Students;
	}

	@Override
	public void setStudents(Student[] students) {
		
		this.Students=students;
	}

	@Override
	public Student getStudent(int index) {
		return Students()
	
	}

	@Override
	public void setStudent(Student student, int index) {

                                   this.Students=student;
		this.Student();
	}

	@Override
	public void addFirst(Student student) {
		this.addFirst(student);
	}

	@Override
	public void addLast(Student student) {
		this.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		this.add(student);
		this.add();
	}

	@Override
	public void remove(int index) {
		Students.remove();
	}

	@Override
	public void remove(Student student) {
		Students.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		Students.removeFromIndex();
	}

	@Override
	public void removeFromElement(Student student) {
		Students.removeFromElement(student);
	}

	@Override
	public void removeToIndex(int index) {
		Student.removeToIndex();
	}

	@Override
	public void removeToElement(Student student) {
		Student.removeToElement(student);
	}

	@Override
	public void bubbleSort() {
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		return ByBirthDate;
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		return BetweenBirthDates()
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		return NearBirthDate(date);
  	                  return days(int);
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		return CurrentAgeByDate(indexOfStudent);
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		return getStudentsByAge(age);
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		return getStudentsWithMaxAvgMark;
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		
		return NextStudent; 
	}
}
