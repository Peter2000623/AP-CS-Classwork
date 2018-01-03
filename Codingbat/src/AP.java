/**
 * 
 * @author PeterSong This file contians the solutions to Codingbat AP-1
 *         problem set.
 */
import java.util.*;
public class AP {
	public boolean scoresIncreasing(int[] scores) {
		  boolean test=true;
		  for(int i=0;i<scores.length-1;i++){
		    if(scores[i]>scores[i+1]){
		      test=false;
		    }
		  }
		  return test;
		}
	public boolean scores100(int[] scores) {
		  boolean result=false;
		  for(int i=0;i<scores.length-1;i++){
		    if(scores[i]==100&&scores[i+1]==100){
		      result=true;
		    }
		  }
		  return result;
		}
	public boolean scoresClump(int[] scores) {
		  boolean result=false;
		  for(int i=0;i<scores.length-2;i++){
		   if(Math.abs(scores[i+1]-scores[i])<=2&&Math.abs(scores[i+2]-scores[i])<=2&&Math.abs(scores[i+1]-scores[i+2])<=2){
		     result=true;
		   }
		  }
		  return result;
		}
	public int scoresAverage(int[] scores) {
		  int[] arr1=new int[scores.length/2];
		  int[] arr2=new int[scores.length-scores.length/2];
		  for(int i=0;i<arr1.length;i++){
		    arr1[i]=scores[i];
		  }
		  for(int i=0;i<arr2.length;i++){
		    arr2[i]=scores[i+scores.length/2];
		  }
		  int a=average(arr1,0,0);
		  int b=average(arr2,0,0);
		  if(a>b){
		    return a;
		  }
		  else return b;
		}
		public int average(int[] scores, int start, int end){
		  int sum=0;
		  for(int i=0;i<scores.length;i++){
		    sum+=scores[i];
		  }
		  return sum/scores.length;
		}
		public int wordsCount(String[] words, int len) {
			  int count=0;
			  for(int i=0;i<words.length;i++){
			    if(words[i].length()==len){
			      count++;
			    }
			  }
			  return count;
			}
		public String[] wordsFront(String[] words, int n) {
			  String[] result = new String[n];
			  for(int i=0;i<n;i++){
			    result[i]=words[i];
			  }
			  return result;
			}
		public List wordsWithoutList(String[] words, int len) {
			  ArrayList result=new ArrayList();
			  for(int i=0;i<words.length;i++){
			    if(words[i].length()!=len){
			      result.add(words[i]);
			    }
			  }
			  return result;
			}
		public boolean hasOne(int n) {
			  boolean result=false;
			  int digit=n%10;
			  while(n!=0){
			    n=n/10;
			    if(digit==1){
			      result=true;
			    }
			    digit=n%10;
			    
			  }
			  return result;
			}
		public boolean dividesSelf(int n) {
			  int n1=n;
			  boolean result=true;
			  int digit=n1%10;
			  while(n1!=0){
			    if(digit==0){
			      result = false;
			    }
			    else if((n/digit)*digit!=n){
			      result=false;
			    }
			    n1/=10;
			    digit=n1%10;
			  }
			  return result;
			}
		public int[] copyEvens(int[] nums, int count) {
			  int[] result=new int[count];
			  int j=0;
			  for(int i=0;i<nums.length;i++){
			    if(j!=result.length){
			      if(nums[i]%2==0){
			        result[j]=nums[i];
			        j++;
			      }
			    }
			  }
			  return result;
			}
		public int[] copyEndy(int[] nums, int count) {
			  int[] result=new int[count];
			  int index=0;
			  for(int i=0;i<nums.length;i++){
			    if(isEndy(nums[i])&&index!=count){
			        result[index]=nums[i];
			        index++;
			    }
			  }
			  return result;
			}
			public boolean isEndy(int n){
			  if(n>=0&&n<=10||n>=90&&n<=100){
			    return true;
			  }
			  else return false;
			}
			public int matchUp(String[] a, String[] b) {
				  int count=0;
				  for(int i=0;i<a.length;i++){
				    if(!a[i].equals("")&&!b[i].equals("")&&a[i].substring(0,1).equals(b[i].substring(0,1))){
				      count++;
				    }
				  }
				 return count;
				}
			public int scoreUp(String[] key, String[] answers) {
				  int score=0;
				  for(int i=0;i<key.length;i++){
				    if(answers[i].equals("?")){
				      score=score;
				    }
				    else if(key[i].equals(answers[i])){
				      score+=4;
				    }
				    else if(!key[i].equals(answers[i])){
				      score-=1;
				    }
				  }
				  return score;
				}
			public String[] wordsWithout(String[] words, String target) {
				  int len=0;
				  for(int i=0;i<words.length;i++){
				    if(words[i].equals(target)){
				      len++;
				    }
				  }
				  String[] result=new String[words.length-len];
				  int index=0;
				  for(int i=0;i<words.length;i++){
				    if(!words[i].equals(target)){
				      result[index]=words[i];
				      index++;
				    }
				  }
				  return result;
				}
			public int scoresSpecial(int[] a, int[] b) {
				  return largest(a)+largest(b);
				}
				public int largest(int[] arr){
				  int lar=0;
				  for(int i=0;i<arr.length;i++){
				    if(arr[i]%10==0&&arr[i]>lar){
				      lar=arr[i];
				    }
				  }
				  return lar;
				}
				public int sumHeights(int[] heights, int start, int end) {
					  int sum=0;
					  for(int i=start;i<end;i++){
					    sum+=Math.abs(heights[i]-heights[i+1]);
					  }
					  return sum;
					}
				public int sumHeights2(int[] heights, int start, int end) {
					  int sum=0;
					  for(int i=start;i<end;i++){
					    if(heights[i+1]>heights[i]){
					    sum+=2*Math.abs(heights[i]-heights[i+1]);
					    }
					    else{
					      sum+=Math.abs(heights[i]-heights[i+1]);
					    }
					  }
					  return sum;
					}
				public int bigHeights(int[] heights, int start, int end) {
					  int sum=0;
					  for(int i=start;i<end;i++){
					    if(Math.abs(heights[i]-heights[i+1])>=5){
					      sum++;
					    }
					      
					  }
					  return sum;
					}
				public int userCompare(String aName, int aId, String bName, int bId) {
					  if(aName.compareTo(bName)<0){
					    return -1;
					  }
					  else if(aName.compareTo(bName)>0){
					    return 1;
					  }
					  else {
					    if(aId-bId<0){
					    return -1;
					  }
					  else if(aId-bId>0){
					    return 1;
					  }
					  else 
					    return 0;
					  
					  }
					  
					}
				public String[] mergeTwo(String[] a, String[] b, int n) {
					  String[] arr=new String[n];
					  int indexa=0;
					  int indexb=0;
					  for(int i=0;i<n;i++){
					    for(int j=0;j<i;j++){
					      if(arr[j].equals(a[indexa])){
					        indexa++;
					      }
					      else if(arr[j].equals(b[indexb])){
					        indexb++;
					      }
					    }
					    if(indexb==b.length||a[indexa].compareTo(b[indexb])<0){
					      arr[i]=a[indexa];
					      indexa++;
					    }
					    else if(indexa==a.length||b[indexb].compareTo(a[indexa])<=0){
					      arr[i]=b[indexb];
					      indexb++;
					    }
					  }
					  return arr;
					}
				public int commonTwo(String[] a, String[] b) {
					  int count=0;
					  String[] test=new String[a.length];
					  for(int h=0;h<test.length;h++){
					    test[h]="";
					  }
					  int index=0;
					  for(int i=0;i<a.length;i++){
					    boolean has=false;
					    for(int j=0;j<b.length;j++){
					      if(a[i].equals(b[j])){
					        has=true;
					      }
					    }
					    boolean dulp=false;
					    for(int k=0;k<test.length;k++){
					      if(test[k].equals(a[i])){
					        dulp=true;
					      }
					    }
					    if(has&&!dulp){
					      test[index]=a[i];
					      index++;
					      count++;
					    }
					  }
					  return count;
					}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
