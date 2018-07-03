import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {

// ----------------------------------------------------//
//  Create an array with the following values:
//    3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers
//    in the array. Also have the function return an array
//    that only includes numbers that are greater than 10
// ----------------------------------------------------//

  // public static void above10Array(int[] numArr) {
  public static void above10Array() {

    int[] numArr = new int[]{3,5,1,2,7,9,8,13,25,32};

    ArrayList<Integer> newArr = new ArrayList<Integer>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(3);
    numbers.add(5);
    numbers.add(1);
    numbers.add(2);
    numbers.add(7);
    numbers.add(9);
    numbers.add(8);
    numbers.add(13);
    numbers.add(25);
    numbers.add(32);

    int sum = 0;
    for(int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
      if(numbers.get(i) > 10) {
        newArr.add(numbers.get(i));
      }
    }
    System.out.println("Sum: " + sum);
    System.out.println("Array: " + newArr + "\n");
  }  // end of method

// ----------------------------------------------------//
//  Create an array with the following values: Nancy, Jinichi,
//    Fujibayashi, Momochi, Ishikawa. Shuffle the array and print
//    the name of each person. Have the method also return an array
//    with names that are longer than 5 characters
// ----------------------------------------------------//

  // public static void shuffledArray(int[] stringArr) {
  public static void shuffledArray() {

    ArrayList<String> stringArr = new ArrayList<String>();
    ArrayList<String> newStringArr = new ArrayList<String>();

    stringArr.add("Nancy");
    stringArr.add("Jinichi");
    stringArr.add("Fujibayashi");
    stringArr.add("Momochi");
    stringArr.add("Ishikawa");

    for(int i = 0; i < stringArr.size(); i++) {
      if(stringArr.get(i).length() > 5) {
        newStringArr.add(stringArr.get(i));
      }
    }
    System.out.println("String Array: " + stringArr + "\n");
    Collections.shuffle(stringArr);
    System.out.println("Suffeled Array: " + stringArr + "\n");
    System.out.println("Array names above 5 chars: " +  newStringArr + "\n");
  }  // --------   end of method  -----------

// ----------------------------------------------------//
//  Create an array that contains all 26 letters of the
//    alphabet (this array must have 26 values). Shuffle
//    the array and display the last letter of the array.
//    Have it also display the first letter of the array.
//    If the first letter in the array is a vowel, have it
//    display a message.
// ----------------------------------------------------//
  public static void shuffleAlphabet() {

    ArrayList<Character> alphaArr = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'));
    ArrayList<Character> vowelArr = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));

// print out each character in the array ------
    // for(int i = 0; i < alphaArr.size(); i++) {
    //   System.out.println(alphaArr.get(i));
    // }

    Collections.shuffle(alphaArr);
    System.out.println("Shuffled:");

    boolean check = false;
    for(Character i = 0; i<5; i++){
      if (alphaArr.get(0) == vowelArr.get(i)){
        check = true;
      }
    }
    if (check){
      System.out.println("It's a vowel, First: " + alphaArr.get(0) + ", Last: " + alphaArr.get(alphaArr.size()-1));
    } else {
      System.out.println("First: " + alphaArr.get(0));
      System.out.println("Last: " + alphaArr.get(alphaArr.size()-1) + "\n");
    }
  }


// ----------------------------------------------------//
//  Generate and return an array with 10 random numbers
//    between 55-100.
// ----------------------------------------------------//

  public static void getRandoms() {
    ArrayList<Integer> numArr = new ArrayList<Integer>();
    Random rnd = new Random();
    for(int i = 0; i < 10; i++) {
      numArr.add(rnd.nextInt(46)+55);
    }
    System.out.println(numArr);
  }



// ----------------------------------------------------//
//  Generate and return an array with 10 random numbers
//    between 55-100 and have it be sorted.
// ----------------------------------------------------//

  public void getRandomSort() {
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    Random r = new Random();
    for (int i=0; i<10; i++){
        newArr.add(r.nextInt(46)+55);
    }
    Collections.sort(newArr);

    System.out.println(newArr+ " Min: "+newArr.get(0)+" Max: "+newArr.get(9));

  }


// ----------------------------------------------------//
//  Create a random string that is 5 characters long.
// ----------------------------------------------------//

  public void randomString(){
      ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
      String newStr = "";
      Random r = new Random();
      for (int i=0; i<5; i++){
          newStr = newStr + arr.get(r.nextInt(26));
      }
      System.out.println(newStr);
  }

// ----------------------------------------------------//
//  Generate an array with 10 random strings that are
//    each 5 characters long.
// ----------------------------------------------------//

  public void randomStrings() {
      ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
      ArrayList<String> newArr = new ArrayList<String>();
      String newStr = "";
      Random r = new Random();
      for (int i=0; i<10; i++){
          for (int j=0; j<5; j++){
              newStr = newStr + arr.get(r.nextInt(26));
          }
          newArr.add(newStr);
          newStr = "";
      }
      System.out.println(newArr);
  }

}  //--------- end of Puzzle CLASS ----------------//
