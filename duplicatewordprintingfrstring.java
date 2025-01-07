package javaCodingPracticeQAs;

public class DuplicateWordsPrint {

	public static void main(String[] args) {
		// print duplicate words in a string
		String string="after trying for so much of the time time I could get the answer answer";
		int count,i,j;
		//convert the string to lowercase
		string.toLowerCase();
		//split the words using " " and store them in an array using split method
		String words[]=string.split(" ");
		System.out.println("Duplicate words in the string are");
		for(i=0;i<words.length-1;i++) {
			count=0;
			for(j=i+1;j< words.length;j++) {
				//compare the words and if similar increment count 
				if(words[i].equals(words[j])){
					count++;
					words[j]="0";//If the words[j]=words[2]contains come then for next iteration that old value'come' is stored so comaparison woon't be done properly hence we need to reset it words[j] to 0;
				}
			}
			if(count>0 && words[i]!="0") {
				System.out.println(words[i]);
			}
		}
			}
}