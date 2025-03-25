
/*
 * #############################
 * import java.util.Scanner;
 * 
 * class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int[] arr = { 10, 20, 30, 40, 54, 60 };
 * int n = arr.length;
 * int k = 0;
 * for (int i = 0; i < n; i++) {
 * if (arr[i] == a) {
 * System.out.println("Element is found at index " + i);
 * k = 1;
 * break;
 * 
 * }
 * }
 * if (k == 0) {
 * System.out.println("Element is not found in array");
 * }
 * }
 * }
 * #######################
 * class Main {
 * public int add(int a, int b) {
 * return a + b;
 * 
 * }
 * 
 * public static void main(String[] args) {
 * Main s1 = new Main();
 * System.out.println(s1.add(2, 3));
 * 
 * }
 * }
 * 
 * class GrandParent {
 * public void display() {
 * System.out.println("Grand Parent");
 * }
 * }
 * 
 * class Parent extends GrandParent {
 * public void p_m() {
 * System.out.println("Parent method");
 * }
 * }
 * 
 * public class Main extends GrandParent {
 * public void c_m() {
 * System.out.println("Child method");
 * }
 * 
 * public static void main(String[] args) {
 * Main m1 = new Main();
 * m1.c_m();
 * m1.display();
 * Parent p1 = new Parent();
 * p1.display();
 * }
 * }
 * import java.util.Scanner;
 * 
 * class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * System.out.println(a);
 * int rem = 0;
 * int rev = 0;
 * while (a > 0) {
 * rem = a % 10;
 * rev = (rev * 10) + rem;
 * a = a / 10;
 * }
 * System.out.println(rev);
 * }
 * }
 * class GrandParent {
 * public void gp_m() {
 * System.out.println("I am GrandParent");
 * }
 * }
 * 
 * class Parent1 extends GrandParent {
 * public void p1_m() {
 * System.out.println("I am Parent1, extended from GrandParent");
 * }
 * }
 * 
 * class Main extends GrandParent {
 * public void p2_m() {
 * System.out.println("I am Parent2, extended from GrandParent");
 * }
 * 
 * public static void main(String[] args) {
 * Main p2 = new Main();
 * p2.gp_m(); // Calling GrandParent method
 * p2.p2_m(); // Calling Parent2 method
 * }
 * }
 * 
 * class Cal{
 * public void add(int a, int b){
 * return a+b;
 * }
 * public double add(int a,int b,int c){
 * return a+b+c;
 * }
 * 
 * }
 * import java.util.Scanner;
 * 
 * public class Main {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * int f1 = 0;
 * int f2 = 1;
 * int f3;
 * for (int i = 1; i <= a; i++) {
 * if (i == 1) {
 * System.out.println(f1);
 * } else if (i == 2) {
 * System.out.println(f2);
 * } else {
 * f3 = f1 + f2;
 * System.out.println(f3);
 * f1 = f2;
 * f2 = f3;
 * }
 * }
 * }
 * }
 * 
 * class Outer {
 * private String message = "Hello my world is full of vedavalu";
 * 
 * public void o_m() {
 * System.out.println("this is first vedava");
 * }
 * 
 * class Inner {
 * public void i_m() {
 * System.out.println("this is second vedava");
 * System.out.println(message);
 * }
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) {
 * Outer sc = new Outer();
 * sc.o_m();
 * Outer.Inner sd = sc.new Inner();
 * sd.i_m(); 0
 * }
 * }
 * 
 * // Outer class
 * 
 * class Outer {
 * 
 * // Instance variable of Outer class
 * 
 * private String message = "Hello from Outer Class";
 * 
 * // Method inside outer class
 * void outerMethod() {
 * 
 * // Print statement
 * 
 * System.out.println("Inside outerMethod");
 * 
 * // Local Inner Class (declared inside method)
 * 
 * class Inner {
 * 
 * // Method defined inside inner class
 * 
 * void innerMethod() {
 * 
 * // Accessing Outer class variable
 * 
 * System.out.println("Inside innerMethod");
 * 
 * System.out.println("Outer class message: " + message);
 * 
 * }
 * 
 * }
 * 
 * // Creating object of inner class
 * 
 * Inner y = new Inner();
 * 
 * // Calling inner class method
 * 
 * y.innerMethod();
 * 
 * }
 * 
 * }
 * 
 * // Main class
 * 
 * public class Main {
 * 
 * public static void main(String[] args) {
 * 
 * // Creating object of outer class
 * System.out.println("first");
 * 
 * Outer x = new Outer();
 * 
 * // Calling outer class method, which in turn calls inner class method
 * 
 * x.outerMethod();
 * 
 * }
 * 
 * }
 * 
 * abstract class BankAccount {
 * 
 * String accountHolder;
 * 
 * double balance;
 * 
 * BankAccount(String holder, double bal) {
 * 
 * this.accountHolder = holder;
 * 
 * this.balance = bal;
 * 
 * }
 * 
 * abstract void deposit(double amount); // Abstract method (no body)
 * 
 * void showBalance() { // Concrete method (with body)
 * 
 * System.out.println("Balance: $" + balance);
 * 
 * }
 * 
 * }
 * 
 * class SavingsAccount extends BankAccount {
 * 
 * SavingsAccount(String holder, double bal) {
 * 
 * super(holder, bal);
 * 
 * }
 * 
 * @Override
 * 
 * void deposit(double amount) {
 * 
 * balance += amount;
 * 
 * System.out.println("Deposited $" + amount + " in Savings Account");
 * 
 * }
 * 
 * }
 * 
 * public class Main {
 * 
 * public static void main(String[] args) {
 * 
 * BankAccount account = new SavingsAccount("Sai", 1000);
 * 
 * account.deposit(500);
 * 
 * account.showBalance();
 * 
 * }
 * 
 * }
 * import java.util.Scanner;
 * 
 * interface Payment {
 * void pay(double amount); // Abstract method (no body)
 * }
 * 
 * class UPI implements Payment {
 * public void pay(double amount) {
 * System.out.println("Paid $" + amount + " using UPI.");
 * }
 * }
 * 
 * class CreditCard implements Payment {
 * public void pay(double amount) {
 * System.out.println("Paid $" + amount + " using Credit Card.");
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * double money = sc.nextDouble();
 * Payment payment1 = new UPI();
 * payment1.pay(money);
 * 
 * Payment payment2 = new CreditCard();
 * payment2.pay(500);
 * }
 * }
 * import java.util.Scanner;
 * 
 * class Fact {
 * int Cal(int n) {
 * int fact = 1;
 * if (n < 1) {
 * return 1;
 * 
 * } else {
 * fact = n * Cal(n - 1);
 * }
 * return fact;
 * 
 * }
 * }
 * 
 * class Hcf {
 * int hcf(int a, int b) {
 * if (b == 0) {
 * return a;
 * } else {
 * return hcf(b, a % b);
 * }
 * }
 * }
 * 
 * class Power {
 * int power(int m, int n) {
 * if (n == 0) {
 * return 1;
 * } else {
 * return m * power(m, n - 1);
 * }
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int m = sc.nextInt();
 * Fact f = new Fact();
 * int res = f.Cal(n);
 * System.out.println("factorial of " + m + "and " + n + " is :" + res);
 * Hcf h = new Hcf();
 * System.out.println("hcf of " + m + "and " + n + " is: " + h.hcf(m, n));
 * Power p = new Power();
 * System.out.println("Power of " + m + "and " + n + " is: " + p.power(m, n));
 * 
 * }
 * }
 * import java.util.Arrays;
 * import java.util.Scanner;
 * 
 * class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int[] arr = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * for (int i = 0; i < n; i++) {
 * for (int j = 0; j < n - 1; j++) {
 * if (arr[j + 1] < arr[j]) {
 * int temp = arr[j + 1];
 * arr[j + 1] = arr[j];
 * arr[j] = temp;
 * }
 * }
 * }
 * System.out.println(Arrays.toString(arr));
 * }
 * }
 * 
 * public class Main {
 * public static <E> void printArray(E[] elements) {
 * for (E element : elements) {
 * System.out.println(element);
 * }
 * System.out.println();
 * }
 * 
 * public static void main(String args[]) {
 * Integer[] intArray = { 10, 20, 30, 40, 50 };
 * Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };
 * System.out.println("Printing Integer Array");
 * printArray(intArray);
 * System.out.println("Printing Character Array");
 * printArray(charArray);
 * }
 * }
 * 
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 * import java.time.format.DateTimeFormatter;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * ZonedDateTime dateTimeInIndia = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
 * System.out.println("Date and time in India: " + dateTimeInIndia + " ");
 * DateTimeFormatter formatter =
 * DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
 * String formattedTime = dateTimeInIndia.format(formatter);
 * System.out.println("Formatted Time and Date: " + formattedTime);
 * }
 * }
 * interface Functional {
 * int operation(int a, int b);
 * 
 * }
 * 
 * public class Main {
 * 
 * public static void main(String[] args) {
 * Functional add = (a, b) -> a + b;
 * Functional multiply = (a, b) -> a * b;
 * System.out.println(add.operation(4, 5));
 * System.out.println(multiply.operation(4, 5));
 * }
 * }
 * import java.util.Arrays;
 * import java.util.List;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
 * numbers.stream().map(n -> n + 10).forEach(System.out::println); // ->20 30 40
 * 50 60
 * long count = numbers.stream().count(); // Count elements ->
 * int sum = numbers.stream().reduce(0, Integer::sum); // Sum of elements
 * boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0); // Check if all
 * are even
 * 
 * System.out.println("Count: " + count);
 * System.out.println("Sum: " + sum);
 * 
 * // ✅ Increment each element by 1 using forEach
 * // numbers.stream().map(n -> n + 1).forEach(System.out::println);
 * 
 * System.out.println("Are all even? " + allEven);
 * }
 * }
 * import java.util.HashMap;
 * import java.util.Scanner;
 * 
 * class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * String s = sc.nextLine();
 * String[] arr1 = s.split("");
 * HashMap<String, Integer> arr = new HashMap<>();
 * for (String s1 : arr1) {
 * if (arr.containsKey(s1)) {
 * arr.put(s1, arr.get(s1) + 1);
 * } else {
 * arr.put(s1, 1);
 * }
 * }
 * for (String key : arr.keySet()) {
 * System.out.println(key + " " + arr.get(key));
 * }
 * }
 * }
 * import java.util.Arrays;
 * 
 * public class RotateArray {
 * public static void main(String[] args) {
 * int[] arr = { 1, 2, 3, 4, 5, 6, 7 }; // Example array
 * int k = 3; // Rotate by 3 positions
 * 
 * rotateArray(arr, k);
 * 
 * System.out.println("Rotated Array: " + Arrays.toString(arr));
 * }
 * 
 * public static void rotateArray(int[] arr, int k) {
 * int n = arr.length;
 * k = k % n; // Handle cases where k > n
 * 
 * reverse(arr, 0, n - 1); // Reverse the entire array
 * reverse(arr, 0, k - 1); // Reverse first k elements
 * reverse(arr, k, n - 1); // Reverse remaining elements
 * }
 * 
 * public static void reverse(int[] arr, int start, int end) {
 * while (start < end) {
 * int temp = arr[start];
 * arr[start] = arr[end];
 * arr[end] = temp;
 * start++;
 * end--;
 * }
 * }
 * }
 * import java.util.Arrays;
 * import java.util.Scanner;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int[] arr = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * for (int i = 0; i < n; i++) {
 * arr[i] = arr[i] + 1;
 * }
 * System.out.println(Arrays.toString(arr));
 * }
 * }
 * 
 * import java.util.Arrays;
 * import java.util.Scanner;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int[] arr = new int[n];
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * for (int i = 0; i < n; i++) {
 * int k = 0;
 * int f = arr[i];
 * int[] temp = new int[n];
 * for (int j = 0; j < n; j++) {
 * int l=0;
 * if (arr[j] > f) {
 * temp[l] = arr[j];
 * l+=1;
 * System.out.println(temp[l]);
 * k = 1;
 * }
 * 
 * }
 * int max = Arrays.stream(temp).min().getAsInt();
 * if (k == 1) {
 * arr[i] = max;
 * } else {
 * arr[i] = -1;
 * }
 * }
 * System.out.println(Arrays.toString(arr));
 * }
 * }
 * 
 * public class Main {
 * public static int[] twoSum(int[] nums, int target) {
 * for (int i = 0; i < nums.length; i++) {
 * for (int j = i + 1; j < nums.length; j++) {
 * if (nums[i] + nums[j] == target) {
 * return new int[]{i, j}; // Found the pair
 * }
 * }
 * }
 * return new int[]{-1, -1}; // No pair found
 * }
 * 
 * public static void main(String[] args) {
 * int[] nums = {2, 7, 11, 15};
 * int target = 9;
 * int[] result = twoSum(nums, target);
 * System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
 * }
 * }
 * 
 * 
 * // Java implementation to find the next
 * // greater element using two loops
 * import java.util.ArrayList;
 * 
 * class GfG {
 * 
 * static ArrayList<Integer> nextLargerElement(int[] arr) {
 * int n = arr.length;
 * ArrayList<Integer> res = new ArrayList<>();
 * 
 * // Initialize res with -1 for all elements
 * for (int i = 0; i < n; i++) {
 * res.add(-1);
 * }
 * 
 * // Iterate through each element in the array
 * for (int i = 0; i < n; i++) {
 * 
 * // Check for the next greater element
 * // in the rest of the array
 * for (int j = i + 1; j < n; j++) {
 * if (arr[j] > arr[i]) {
 * res.set(i, arr[j]);
 * break;
 * }
 * }
 * }
 * 
 * return res;
 * }
 * 
 * public static void main(String[] args) {
 * 
 * int[] arr = { 6, 8, 0, 1, 3 };
 * 
 * ArrayList<Integer> res = nextLargerElement(arr);
 * 
 * for (int x : res) {
 * System.out.print(x + " ");
 * }
 * }
 * }
 * 
 * import java.util.Arrays;
 * 
 * class Main {
 * public static void main(String[] args) {
 * int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
 * int[][] arr1 = new int[3][3];
 * int k = 0, l = 0;
 * for (int i = 0; i < 3; i++) {
 * for (int j = 2; j > 0; j--) {
 * arr1[k][l] = arr[i][j];
 * k += 1;
 * l += 1;
 * }
 * }
 * System.out.println(Arrays.deepToString(arr1));
 * }
 * }
 * import java.util.LinkedList;
 * import java.util.Queue;
 * 
 * class Main {
 * public static void main(String[] args) {
 * Queue<Integer> arr = new LinkedList<>(); // ✅ Use LinkedList
 * arr.add(1);
 * arr.add(2);
 * arr.add(3);
 * System.out.println(arr); // Output: [1, 2, 3]
 * }
 * }
 * import java.util.ArrayDeque;
 * 
 * class Main {
 * public static void main(String[] args) {
 * ArrayDeque<Integer> q = new ArrayDeque<>();
 * q.add(1);
 * q.offer(2);
 * q.add(3);
 * }
 * 
 * class MyThread extends Thread {
 * public void run() {
 * System.out.println("Thread is running");
 * }
 * 
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * MyThread t1 = new MyThread();
 * t1.start();
 * }
 * 
 * public class Main{
 * public static void main(String[] args) {
 * // 1. Create a new thread
 * Thread t1 = new Thread(()->{
 * System.out.println("Thread1");
 * try{
 * Thread.sleep(1000);
 * }
 * catch(InterruptedException e){}
 * 
 * });
 * Thread t2=new Thread(()->{System.out.println("Thread2..");}
 * 
 * t1.start();
 * t1.join();}
 * }
 * 
 * import java.util.concurrent.ExecutorService;
 * import java.util.concurrent.Executors;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * ExecutorService executor = Executors.newFixedThreadPool(3);
 * Runnable task = () -> {
 * System.out.println(Thread.currentThread().getName() + " is excuting");
 * };
 * for (int i = 0; i < 5; i++) {
 * executor.submit(task);
 * }
 * executor.shutdown();
 * }
 * }
 * import java.util.concurrent.Callable;
 * import java.util.concurrent.ExecutionException;
 * import java.util.concurrent.ExecutorService;
 * import java.util.concurrent.Executors;
 * import java.util.concurrent.Future;
 * 
 * public class Main {
 * public static void main(String[] args) throws ExecutionException,
 * InterruptedException {
 * ExecutorService executor = Executors.newSingleThreadExecutor();
 * Callable<Integer> task = () -> {
 * Thread.sleep(3000);
 * return 10 * 10;
 * };
 * Future<Integer> f = executor.submit(task);
 * System.out.println("doing the task");
 * Integer res = f.get();
 * System.out.println("result is " + res);
 * System.out.println("Task");
 * executor.shutdown();
 * 
 * }
 * }
 * //import java.util.concurrent.Callable;
 * 
 * import java.util.concurrent.CountDownLatch;
 * 
 * public class Main {
 * public static void main(String[] args) throws InterruptedException {
 * CountDownLatch latch = new CountDownLatch(3);
 * 
 * Runnable worker = () -> {
 * System.out.println(Thread.currentThread().getName() + " Worker Started");
 * try {
 * Thread.sleep(3000);
 * latch.countDown(); // Reduce latch count
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * };
 * 
 * // Start 3 worker threads
 * for (int i = 0; i < 3; i++) {
 * new Thread(worker).start();
 * }
 * 
 * latch.await(); // Wait until count reaches zero
 * System.out.println("All workers finished");
 * }
 * }
 * import java.util.*;
 * class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int[] arr = new int[n];
 * ArrayList <Integer>arr1=new ArrayList<>();
 * ArrayList<Integer>res=new ArrayList<>();
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * Arrays.sort(arr);
 * int m=sc.nextInt();
 * int mx,mn,di;
 * for(int i=0;i<n-2;i++){
 * for(int j=i;j<i+3;j++){
 * arr1.add(arr[j]);
 * }
 * mx=Collections.max(arr1);
 * mn=Collections.min(arr1);
 * di=mx-mn;
 * res.add(di);
 * arr1.clear();
 * 
 * }
 * System.out.println(Collections.min(res));
 * }
 * }
 * import java.util.*;
 * class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * sc.nextLine();
 * String s=sc.nextLine();
 * char[]arr=s.toCharArray();
 * int mc=0;
 * int f=0;
 * for(char c:arr){
 * if(c=='S'){
 * f+=1;
 * mc=Math.max(mc,f);
 * }
 * else{
 * f=0;
 * 
 * }
 * }
 * System.out.println(mc);
 * }
 * }
 *
 * import java.util.*;
 * class Main {
 * public static void main(String[] args) {
 * Scanner sc=new Scanner(System.in);
 * int n=sc.nextInt();
 * int []arr=new int[n];
 * for(int i=0;i<n;i++){
 * arr[i]=sc.nextInt();
 * }
 * int m=sc.nextInt();
 * int res;
 * for(int i=0;i<n;i++){
 * for(int j=i+1;j<n;j++){
 * res=(arr[i]+arr[j])/2;
 * if(res>=m){
 * System.out.print("("+arr[i]+","+arr[j]+")");
 * }
 * res=0;
 * }
 * 
 * }
 * 
 * }
 * }
 * 
 * 
 */