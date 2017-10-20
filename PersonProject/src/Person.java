import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public abstract class Person
{
	public abstract String greeting();
	public String birthDate;
	public String firstName;
	public String familyName;
	public String currentDate()
	{
		DateFormat thing=new SimpleDateFormat("yyyy-MM-dd");
		Date today=new Date();
		return thing.format(today);
	}
	public int age(String birth)
	{
		return 0;
	}
}