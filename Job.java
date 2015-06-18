// how to use workresult
/*
	1	Job name
	2	Time used
	3	Money earned
	4	Skill improved
	5	Amount improved
 */

public class Job {

	public String learnClean (){
		String re = "You will clean your house using 8 hours";
		return re;
	}

	public int[] doClean () {
		int[] workresult = {1, 8, 5, 5, 5};
		return workresult;
	}

}