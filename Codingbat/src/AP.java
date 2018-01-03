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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
