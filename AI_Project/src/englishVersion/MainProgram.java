package englishVersion;

import java.util.*;
import koreaVersion.MainProgram1;

public class MainProgram {

	static Scanner input = new Scanner(System.in);

	static String mainmenunumber;
	static int firstmenunumber;
	static int secondmenunumer;
	
	static Customer ct[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new FirstManual();
		while(true) {
			System.out.println("===================================================");
			System.out.println("1. 한국어 버전");
			System.out.println("2. English version");
			System.out.println("3. 종료 (Exit)");
			System.out.println("===================================================");
		
			String choose = input.next();
			
			if (Integer.parseInt(choose) == 1) {
				MainProgram1 korean1 = new MainProgram1();
				korean1.korean();
			}
			else if (Integer.parseInt(choose) == 2) {
				english1();
			}
			
			else {
				break;
				}
		}

	}
	public static void english1() throws Exception {
		while (true) { // 영어 메뉴 반복문
			printMainMenu();
			mainmenunumber = input.next(); // next() Integer.parseInt();
			
			try {			
				if(Integer.parseInt(mainmenunumber) == 1) {
					while (Integer.parseInt(mainmenunumber) == 1) { 			// 1. 고객 관리
						printFirstMenu();
						firstmenunumber = input.nextInt();
						
						if (firstmenunumber == 1) { 		// 1-1 입력
							firstMenuInputCtData();	
						} else if (firstmenunumber == 2) {  // 1-2 삭제 
							firstMenuDeletCtData();					
						} else if (firstmenunumber == 3) break;
						  else {
							printError();
							break;
						}	
					}	
				} else if (Integer.parseInt(mainmenunumber) == 2) {
					while (Integer.parseInt(mainmenunumber) == 2) {         // 2. 고객 정보 보기
						printSecondMenu();
						secondmenunumer = input.nextInt();
						
						if (secondmenunumer == 1) { 	   // 2-1 전체
							secondMenuOneFullListView();										
						} else if (secondmenunumer == 2) { // 2-2 분류 
							secondMenuTwoCategoriListSetStandard();					
						} else if (secondmenunumer == 3) { // 2-3 항목
							secondMenuThreeItemalizeList();					
						} else if (secondmenunumer == 4) break;
						  else {
							printError();
							break;
						}
					}
				} else if (Integer.parseInt(mainmenunumber) == 3) break;
				  else printError();
				
			} catch (InputMismatchException e) {
				printError();
				e.getMessage();
			} catch (NullPointerException n) {
				printError();
				n.getMessage();
			} catch (NumberFormatException num) {
				printError();
				num.getMessage();
			}
		}
	}
	
	public static void cleanConsol() {
		for ( int i = 0 ; i < 20 ; i++) {
			System.out.println();
		}
	}

	public static void printMainMenu() {
		cleanConsol();
		System.out.println("===================================================");
		System.out.println("[ Main Menu ]");
		System.out.println("1. Customer Information Management");
		System.out.println("2. Customer Information View");
		System.out.println("3. back choose language");
		System.out.println("===================================================");
		System.out.print("- Choose Number : ");
	}

	public static void printFirstMenu() {
		cleanConsol();
		System.out.println("===================================================");
		System.out.println("[ First Menu ]");
		System.out.println(" 1. Insertion");
		System.out.println(" 2. Deletion");
		System.out.println(" 3. Back to Main menu");
		System.out.println("===================================================");
		System.out.print("- Choose number : ");
	}

	public static void printSecondMenu() {
		cleanConsol();
		System.out.println("===================================================");
		System.out.println("[ Scond Menu ]");
		System.out.println(" 1. Full List view");
		System.out.println(" 2. Categori List view");
		System.out.println(" 3. Itemized Listview");
		System.out.println(" 4. Back to Manin menu");
		System.out.println("===================================================");
		System.out.print("- Choose number : ");
	}

	public static void printError() {
		System.out.println();
		System.out.println("- Input data error -");
		System.out.println();
	}

	public static void firstMenuInputCtData() throws Exception {
		
		String inputCtNumberOf;
		int i; // 고객 배열값
		System.out.println("\n---------[ First Menu - Insert Cusmomer ]------------");
		System.out.print("\n◆ How many do you insert Customer ? : ");
		try {inputCtNumberOf = input.next();
		
		// 고객 명수 만큼 배열 만들기 과정
		ct = new Customer[Integer.parseInt(inputCtNumberOf)];
		for (i = 0; i < ct.length; i++) {
			ct[i] = new Customer();
		}

		i = 0;
		String id = null, gen = null, loc = null;
		int age = 0, time = 0;
		String inputCtInpormationRecheck;

		while (Integer.parseInt(inputCtNumberOf) > i) {
			// 고객 정보 넣기
			System.out.println();
			System.out.print("▷ ID : ");
			id = input.next();
			System.out.print("▷ Age : ");
			age = input.nextInt();
			System.out.print("▷ Genger (Female : f / Male : m) : ");
			gen = input.next();
			System.out.print("▷ Location (the eight provinces of Korea) : ");
			loc = input.next();
			System.out.print("▷ Online use Time (hour) : ");
			time = input.nextInt();

			if (age <= 13 || age > 100) {
				System.out.println();
				System.out.println("- You need your protector -");
				System.out.println();
				continue;
			} 

			if (gen.equals("f"))
				gen = "Female";
			else if (gen.equals("m"))
				gen = "Male";
			else {
				System.out.println();
				System.out.println("- You need choose female or male -");
				System.out.println();
				continue;
			}
			
			loc = loc.toLowerCase();
			if (loc.equals("gg") || loc.equals("gyeonggi_do") || loc.equals("gyeonggido") )
				loc = "GyeongGi_Do";
			else if (loc.equals("gw") || loc.equals("gangwon_do") || loc.equals("gangwondo"))
				loc = "GangWon_Do";
			else if (loc.equals("gs") || loc.equals("gyeongsang_do") || loc.equals("gyeongsangdo"))
				loc = "GyeongSang_Do";
			else if (loc.equals("cc") || loc.equals("chungchung_do") || loc.equals("chungchungdo"))
				loc = "ChungChung_Do";
			else if (loc.equals("jj") || loc.equals("jeju_do") || loc.equals("jejudo"))
				loc = "JeJu_Do";
			else if (loc.equals("jl") || loc.equals("jeolla_do") || loc.equals("jeollado"))
				loc = "JeolLa_Do";
			else {
				System.out.println();
				System.out.println("- The regional setting is based on Korea's eight degrees, and the word ends Includes _do");
				System.out.println();
				continue;
			}


			// 고객 정보 확인
			System.out.println("\n------[ First Menu - Insert Cusmomer Recheck]------");
			System.out.printf("▶ [ID] %s [Location] %s \n  [Age] %d [Gender] %s \n  [Internet use Time(basis hour)] %d(h) \n", id, loc, age, gen, time);
			System.out.println("---------------------------------------------------");

			System.out.print("- Sure save Customer data (yes or no) ? : "); // inputCtInpormationRecheck // 초기화까지
			inputCtInpormationRecheck = input.next();

			if (inputCtInpormationRecheck.equals("yes")) {
				ct[i].id = id;
				ct[i].age = age;
				ct[i].gender = gen;
				ct[i].location = loc;
				ct[i].out = time;
				i++;
				System.out.println();
				System.out.println(
						"           ┌───────────────────────┐\n" + "           │         Sucess        │\n" + "           └───────────────────────┘");
				System.out.println();
				continue;
			} else if (inputCtInpormationRecheck.equals("no"))
				continue;
			else {
				System.out.println("\n- Answer can only be yes or no -\n");
				continue;
			}
		}
		}catch(InputMismatchException e) { 
			e.getMessage();
		}catch (NumberFormatException num) {
			printError();
			num.getMessage();
		}
	}

	public static void firstMenuDeletCtData() throws Exception {

		while(true) {				
			int deleteCtNumber;
			
			Arrays.sort(ct); // Comparable implements
		 	for ( int j = 0 ; j < ct.length ; j ++) {
		 		System.out.printf("\n[ Number %d Cumtomer Information ]------------------\n%s \n", j + 1 ,ct[j]);
		 		System.out.println("---------------------------------------------------");
		 	}
		 	
		 	System.out.print("- Please enter the number to be deleted (back -1) : ");
		 	deleteCtNumber = input.nextInt();
		 	
		 	if (deleteCtNumber == -1) break;
			ct[deleteCtNumber - 1] = null;
		}

	}

	public static void secondMenuOneFullListView() {
		
		Arrays.sort(ct); // Comparable implements
		System.out.println("\n----------[ Scond Menu - Full List view ]----------");
		try{for ( int j = 0 ; j < ct.length ; j ++) {
			System.out.println(ct[j]);} 
		  System.out.println("---------------------------------------------------");
		} catch (NullPointerException e) { e.getMessage();}
		System.out.println();
	}
	
	public static void secondMenuTwoCategoriListSetStandard() throws Exception {
		
		int setInputStandard1;
		int setInputStandard2;
		
		Customer [] Default;
		Customer [] Likely;
		Customer [] Ideal;
		
		int cnt_d = 0, cnt_l = 0, cnt_i = 0;
		
		System.out.println("\n----------[ Second Menu - Categori LIst ]----------");
		System.out.println("▷ Default <= [ n ] < Likely < [ n ] <= Ideal");
		System.out.print("▷ First n : ");
		setInputStandard1 = input.nextInt();
		System.out.print("▷ Second n : ");
		setInputStandard2 = input.nextInt();
		System.out.println("---------------------------------------------------\n");
		
		for ( int j = 0; j < ct.length ; j++) {
			
			if (ct[j].getOut() <= 0) continue;
			else if (ct[j].getOut() <= setInputStandard1 ) cnt_d++;
			else if (ct[j].getOut() < setInputStandard2) cnt_l++;
			else if (ct[j].getOut() >= setInputStandard2) cnt_i++;
			
		}
		
		Default = new Customer[cnt_d];
		Likely = new Customer[cnt_l];
		Ideal = new Customer[cnt_i];
		
		cnt_d = 0; cnt_l = 0; cnt_i = 0;
		
		for( int j = 0 ; j < ct.length ; j++) {
			if (ct[j].getOut() <= 0) continue;
			else if (ct[j].getOut() <= setInputStandard1 ) {
				Default[cnt_d] = ct[j];
				cnt_d++;
			}
			else if (ct[j].getOut() < setInputStandard2) {
				Likely[cnt_l] = ct[j];
				cnt_l++;
			}
			else if (ct[j].getOut() >= setInputStandard2) {
				Ideal[cnt_i] = ct[j];
				cnt_i++;
			}
			
		}
		
		if (cnt_d != 0) {
			System.out.println("< Default Group >----------------------------------");
			Arrays.sort(Default);
			for( int j = 0 ; j < cnt_d ; j++) System.out.println(Default[j]);
			System.out.println("---------------------------------------------------");
		} else System.out.println("< Default Group >----------------------------------\n- Empty -\n---------------------------------------------------");
		if (cnt_l != 0) {
			System.out.println("< Likely Group >-----------------------------------");
			Arrays.sort(Likely);
			for( int j = 0 ; j < cnt_l ; j++) System.out.println(Likely[j]);
			System.out.println("---------------------------------------------------");
		} else System.out.println("< Likely Group >-----------------------------------\n- Empty -\n---------------------------------------------------");
		if (cnt_i != 0) {
			System.out.println("< Ideal Group  >-----------------------------------");
			Arrays.sort(Ideal);
			for( int j = 0 ; j < cnt_i ; j++) System.out.println(Ideal[j]);
			System.out.println("---------------------------------------------------\n");
		} else System.out.println("< Ideal Group >------------------------------------\n- Empty -\n---------------------------------------------------\n");
	}
	
	public static void secondMenuThreeItemalizeList() throws Exception{
		
		while(true) {
			cleanConsol();
			int secondMenuThreeCategori;
			System.out.println("\n--------[ Second Menu - Itemalize List ]-----------");
			System.out.println("  1. Array Id");
			System.out.println("  2. Array Age");
			System.out.println("  3. Array Gender");
			System.out.println("  4. Array Location");
			System.out.println("  5. Back to Second Menu ");
			System.out.println("---------------------------------------------------");
			System.out.print("- Select number, the array you want : ");
			secondMenuThreeCategori = input.nextInt();
			
			// 아이디
			if (secondMenuThreeCategori == 1) {
					
				Arrays.sort(ct, new Comparator<Customer>() { // 숫자로 시작할 경우...
					@Override
					public int compare(Customer o1, Customer o2) {
						return o1.id.compareTo(o2.id);
					}					
				});
				System.out.println("\n< Second Menu - ID array List >--------------------");
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);	
				  System.out.println("---------------------------------------------------");
			// 나이	
			} else if (secondMenuThreeCategori == 2) {
				
				Arrays.sort(ct, new Comparator<Customer>() {
					@Override
					public int compare(Customer o1, Customer o2) {
						if (o1.age > o2.age) return 1;
						else if (o1.age == o2.age) {
							return (o1.id.compareTo(o2.id));
						}
						else return -1;
						
					}
					
				});
				System.out.println("\n< Second Menu - Age array List >-------------------");
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);
				  System.out.println("---------------------------------------------------");
				
			} // 성별
			else if (secondMenuThreeCategori == 3) {
				
			String genderChoose;
			
			System.out.println("\n< Second Menu - Gender array List >----------------");
			System.out.print("- Enter the gender you want to array forward. (female, male) : ");
			genderChoose = input.next();
	
				Arrays.sort(ct, new Comparator<Customer>() {
					@Override
					public int compare(Customer o1, Customer o2) { 
						if (genderChoose.equals("Female")) return (o2.gender.compareTo(o1.gender));
						else if (o1.gender.equals(o2.gender)) { // 성별이 동일할 경우
							if (o1.age > o2.age) return 1;
							else if (o1.age == o2.age) {
								return (o1.id.compareTo(o2.id));
							}
							else return -1;
						}
						else return (o1.gender.compareTo(o2.gender));
						
					}
					
				});
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);
				System.out.println("---------------------------------------------------");
			// 지역
			} else if (secondMenuThreeCategori == 4) {
				
				int cnt_gg = 0, cnt_gw = 0, cnt_gs = 0, cnt_cc = 0, cnt_jj = 0, cnt_jl = 0;
				
				for ( int i = 0 ; i < ct.length ; i ++) {
					
					if (ct[i].getLocation().equals("GyeongGi_Do")) cnt_gg++;
					else if (ct[i].getLocation().equals("GangWon_Do")) cnt_gw++;
					else if (ct[i].getLocation().equals("GyeongSang_Do")) cnt_gs++;
					else if (ct[i].getLocation().equals("ChungChung_Do")) cnt_cc++;
					else if (ct[i].getLocation().equals("JeJu_Do")) cnt_jj++;
					else cnt_jl++;
					
				}
				
				Customer [] longg = new Customer[cnt_gg];
				Customer [] longw = new Customer[cnt_gw];
				Customer [] longs = new Customer[cnt_gs];
				Customer [] loncc = new Customer[cnt_cc];
				Customer [] lonjj = new Customer[cnt_jj];
				Customer [] lonjl = new Customer[cnt_jl];
				
				cnt_gg = 0; cnt_gw = 0; cnt_gs = 0; cnt_cc = 0; cnt_jj = 0; cnt_jl = 0;
				
				for ( int i = 0 ; i < ct.length ; i ++) {
					
					if(ct[i].getLocation().equals("GyeongGi_Do")) {
						longg[cnt_gg] = ct[i];
						cnt_gg++;
					} else if (ct[i].getLocation().equals("GangWon_Do")) {
						longw[cnt_gw] = ct[i];
						cnt_gw++;
					} else if (ct[i].getLocation().equals("GyeongSang_Do")) {
						longs[cnt_gs] = ct[i];
						cnt_gs++;
					} else if (ct[i].getLocation().equals("ChungChung_Do")) {
						loncc[cnt_cc] = ct[i];
						cnt_cc++;
					} else if (ct[i].getLocation().equals("JeJu_Do")) {
						lonjj[cnt_jj] = ct[i];
						cnt_jj++;
					} else {
						lonjl[cnt_jl] = ct[i];
						cnt_jl++;
					}
				}
				while(true) {
					cleanConsol();
					int locationChoose;		
					System.out.println("\n< Second Menu - Location array List >--------------");
					System.out.println("  1. GyeongGi_Do");
					System.out.println("  2. GangWon_Do");
					System.out.println("  3. GyeongSang_Do");
					System.out.println("  4. ChungChung_Do");
					System.out.println("  5. JeJu_Do");
					System.out.println("  6. JeolLa_Do");
					System.out.println("  7. Back to Itemalize List ");
					  System.out.println("---------------------------------------------------");
					System.out.print("- Select the sort by location : ");
					locationChoose = input.nextInt();
					
					if(locationChoose == 1) {
						if (cnt_gg != 0) {
							System.out.println("\n< Second Menu - GyeongGi_Do array List >-----------");
							for ( int i = 0 ; i < longg.length ; i ++) System.out.println(longg[i]);
							  System.out.println("---------------------------------------------------");	
						} else { 
							System.out.println("\n< Second Menu - GyeongGi_Do array List >---------\n- Empty -");
							System.out.println("---------------------------------------------------");		
						}
					}
					else if(locationChoose == 2) {
						if (cnt_gw != 0) {
							System.out.println("\n< Second Menu - GangWon_Do array List >------------");
							for ( int i = 0 ; i < longw.length ; i ++) System.out.println(longw[i]);
						} else { 
							System.out.println("\n< Second Menu - GangWon_Do array List >------------\n- Empty -");
							  System.out.println("---------------------------------------------------");	
						}

						
					}
					else if(locationChoose == 3) {
						if (cnt_gs != 0) {
							System.out.println("\n< Second Menu - GyeongSang_Do array List >---------");
							for ( int i = 0 ; i < longs.length ; i ++) System.out.println(longs[i]);
							  System.out.println("---------------------------------------------------");
							continue;
						} else { 
							System.out.println("\n< Second Menu - GyeongSang_Do array List >---------\n- Empty -");
							  System.out.println("---------------------------------------------------");						
						}
					}
					else if(locationChoose == 4) {
						if (cnt_cc != 0) {
							System.out.println("\n< Second Menu - ChungChung_Do array List >---------");
							for ( int i = 0 ; i < loncc.length ; i ++) System.out.println(loncc[i]);
						} else { 
							System.out.println("\n< Second Menu - ChungChung_Do array List >---------\n- Empty -");
							  System.out.println("---------------------------------------------------");		
						}							
					}
					else if(locationChoose == 5) {
						if (cnt_jj != 0) {
							System.out.println("\n< Second Menu - JeJu_Do array List >---------------");
							for ( int i = 0 ; i < lonjj.length ; i ++) System.out.println(lonjj[i]);
						} else { 
							System.out.println("\n< Second Menu - JeJu_Do array List >---------------\n- Empty -");
							  System.out.println("---------------------------------------------------");		
						}	 	

					}
					else if(locationChoose == 6) {
						if(cnt_jl != 0) {
							System.out.println("\n< Second Menu - JeolLa_Do array List >-------------");
							for ( int i = 0 ; i < lonjl.length ; i ++) System.out.println(lonjl[i]);
						} else { 
							System.out.println("\n< Second Menu - JeolLa_Do array List >-------------\n- Empty -");
							  System.out.println("---------------------------------------------------");		
						}	 
					}
					else if(locationChoose == 7) break;
					else System.out.println("- number error -");		
				}
			} else if (secondMenuThreeCategori == 5) break;
		}
	}
}
