package koreaVersion;

import java.util.*;

public class MainProgram1 {

	static Scanner input = new Scanner(System.in);

	static int mainmenunumber;
	static int firstmenunumber;
	static int secondmenunumer;

	static Customer1 ct[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		korean();

	}
	public static void korean() {
		while (true) { // 메인 메뉴 반복문
			printMainMenu();
			try {
				mainmenunumber = input.nextInt();
				// 고객 관리
				if (mainmenunumber == 1) {
					select1();
				}
				// 고객 정보 보기
				else if (mainmenunumber == 2) {
					select2();
				}
				else {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void select1() { //고객 입력 삭제 선택 함수
		while(true) {
			try {
			// clearConsole();
				printFirstMenu();
				firstmenunumber = input.nextInt();
				// 고객 정보 입력
				if (firstmenunumber == 1) {
		
					// clearConsole();
					firstMenuInputCtData();
					// 고객 정보 삭제
				} else if (firstmenunumber == 2) {
		
					// clearConsole();
					firstMenuDeletCtData();
		
				} else
					break;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	public static void select2() { // view 선택 함수
		while(true) {
			// clearConsole();
			try {
				printSecondMenu();
				secondmenunumer = input.nextInt();
				// 전체 리스트
				if (secondmenunumer == 1) {
		
					Arrays.sort(ct); // Comparable implements
		
					System.out.println("\n-----[ 두번째 메뉴 - 전체 다 보기 ]-----");
		
					for (int j = 0; j < ct.length; j++) {
						System.out.println(ct[j]);
					}
					System.out.println("-----------------------------------------");
					System.out.println();
		
					// 타겟 리스트
				} else if (secondmenunumer == 2) {
		
					// clearConsole();
					secondMenuTwoCategoriListSetStandard();
		
					// 항목별
				} else if (secondmenunumer == 3) {
		
					// clearConsole();
					secondMenuThreeItemalizeList();
		
				} else
					break;
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void clearConsole() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public static void printMainMenu() {
		System.out.println("=====================================");
		System.out.println("[ 메인 메뉴 ]");
		System.out.println("1. 고객 관리 하기");
		System.out.println("2. 고객 보기");
		System.out.println("3. 언어 선택으로 돌아가기");
		System.out.println("=====================================");
		System.out.print("- 번호 선택 : ");

		
	}

	public static void printFirstMenu() {
		System.out.println("=====================================");
		System.out.println("[ 첫번째 메뉴 ]");
		System.out.println(" 1. 고객값 입력하기");
		System.out.println(" 2. 고객값 삭제하기");
		System.out.println(" 3. 뒤로가기");
		System.out.println("=====================================");
		System.out.print("- 번호 선택 : ");

	}

	public static void printSecondMenu() {
		System.out.println("=====================================");
		System.out.println("[ 두번째 메뉴 ]");
		System.out.println(" 1. 전체 다 보기 (시간 정렬)");
		System.out.println(" 2. 고객 분류하기");
		System.out.println(" 3. 입력값에 따른 오름차순으로 보기");
		System.out.println(" 4. 메뉴 뒤로가기");
		System.out.println("=====================================");
		System.out.print("- 번호 선택 : ");

	}

	public static void printError() {
		System.out.println();
		System.out.println("- 번호 오류 -");
		System.out.println();
	}

	public static void firstMenuInputCtData() {

		int inputCtNumberOf;
		int i; // 고객 배열값
		System.out.println("-----------------------------------------");
		System.out.println("\n[ 첫번째 메뉴 - 고객 입력하기 ]");
		System.out.print("▷ 몇명을 입력 하실건가요? : ");
		try {
			inputCtNumberOf = input.nextInt();

			// 고객 명수 만큼 배열 만들기 과정
			ct = new Customer1[inputCtNumberOf];
			for (i = 0; i < ct.length; i++) {
				ct[i] = new Customer1();
			}

			i = 0;
			String id = null, gen = null, loc = null;
			int age = 0, time = 0;
			String inputCtInpormationRecheck;

			while (inputCtNumberOf > i) {
				// 고객 정보 넣기
				System.out.print("▷ 아이디 : ");
				id = input.next();
				System.out.print("▷ 나이 : ");
				age = input.nextInt();
				System.out.print("▷ 성별 (남자 : 여자) : ");
				gen = input.next();
				System.out.print("▷ 지역 (도를 입력하세요!) : ");
				loc = input.next();
				System.out.print("▷ 이용 시간 (시) : ");
				time = input.nextInt();

				if (age <= 13 || age > 100) {
					System.out.println();
					System.out.println("- 보호자가 필요합니다. -");
					System.out.println();
					continue;
				} else if (age <= 19)
					age = 10;
				else if (age <= 29)
					age = 20;
				else if (age <= 39)
					age = 30;
				else if (age <= 49)
					age = 40;
				else if (age <= 59)
					age = 50;
				else if (age <= 69)
					age = 60;
				else
					age = 70;

				if (gen.equals("f"))
					gen = "Female";
				else if (gen.equals("m"))
					gen = "Male";
				else {
					System.out.println();
					System.out.println("- 남자와 여자를 선택해라! -");
					System.out.println();
					continue;
				}

				loc = loc.toLowerCase();
				if (loc.equals("gg") || loc.equals("gyeonggi_do") || loc.equals("gyeonggido"))
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
					System.out.println(
							"- 지역이 없는듯 하오..");
					System.out.println();
					continue;
				}

				// 고객 정보 확인
				System.out.println();
				System.out.println("-------[ 첫번째 메뉴 - 다시 확인하기 ]-------");
				System.out.printf(
						"▶ 아이디 : %s \n▶ 나이 : %d, 성별 : %s, 지역 : %s \n▶ 이용시간(달) : %d(시간) \n",
						id, age, gen, loc, time);
				System.out.println("-----------------------------------------------------");

				System.out.print("입력값을 저장하실건가요 (네 또는 아니요) ? : "); // inputCtInpormationRecheck //
																						// 초기화까지
				inputCtInpormationRecheck = input.next();

				if (inputCtInpormationRecheck.equals("yes")) {
					ct[i].id = id;
					ct[i].age = age;
					ct[i].gender = gen;
					ct[i].location = loc;
					ct[i].out = time;
					i++;
					System.out.println();
					System.out.println("┌───────────────────────┐\n" + "│         성   공        │\n"
							+ "└───────────────────────┘");
					System.out.println();
					continue;
				} else if (inputCtInpormationRecheck.equals("no"))
					continue;
				else {
					printError();
					continue;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void firstMenuDeletCtData() {
		while (true) {

			int deleteCtNumber;

			Arrays.sort(ct); // Comparable implements
			System.out.println();
			for (int j = 0; j < ct.length; j++)
				System.out.printf("\n[ %d번 고객님의 정보 ]-------------------------\n%s \n", j + 1, ct[j]);
			System.out.println();
			System.out.print("▷ 삭제하실 고격번호를 입력해주세요 : ");
			deleteCtNumber = input.nextInt();
			try {
				ct[deleteCtNumber - 1] = null;

				Arrays.sort(ct); // Comparable implements
				for (int j = 0; j < ct.length; j++)
					System.out.printf("%d번 고객의 정보가 삭제 되었습니다", j + 1);

			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public static void secondMenuTwoCategoriListSetStandard() {

		int setInputStandard1;
		int setInputStandard2;

		Customer1[] Default;
		Customer1[] Likely;
		Customer1[] Ideal;

		int cnt_d = 0, cnt_l = 0, cnt_i = 0;
		System.out.println("----------------------------------------------");
		System.out.println("-----[ 두번째 메뉴 - 고객 분류하기 ]-----");
		System.out.println("▷ 안사는 고객.. <= [ 사용시간 ] < 중간 고객 < [ 사용시간 ] <= 좋은 고객");
		System.out.print("▷ 첫번째 사용시간 입력 : ");
		try {
			setInputStandard1 = input.nextInt();
			System.out.print("▷ 두번째 사용시간 입력 : ");
			setInputStandard2 = input.nextInt();

			for (int j = 0; j < ct.length; j++) {

				if (ct[j].getOut() <= 0)
					continue;
				else if (ct[j].getOut() <= setInputStandard1)
					cnt_d++;
				else if (ct[j].getOut() < setInputStandard2)
					cnt_l++;
				else if (ct[j].getOut() >= setInputStandard2)
					cnt_i++;

			}

			Default = new Customer1[cnt_d];
			Likely = new Customer1[cnt_l];
			Ideal = new Customer1[cnt_i];

			cnt_d = 0;
			cnt_l = 0;
			cnt_i = 0;

			for (int j = 0; j < ct.length; j++) {
				if (ct[j].getOut() <= 0)
					continue;
				else if (ct[j].getOut() <= setInputStandard1) {
					Default[cnt_d] = ct[j];
					cnt_d++;
				} else if (ct[j].getOut() < setInputStandard2) {
					Likely[cnt_l] = ct[j];
					cnt_l++;
				} else if (ct[j].getOut() >= setInputStandard2) {
					Ideal[cnt_i] = ct[j];
					cnt_i++;
				}

			}
			System.out.println("[ 안사는 고객.. ]");
			Arrays.sort(Default);
			for (int j = 0; j < cnt_d; j++)
				System.out.println(" " + Default[j]);

			System.out.println("[  중간 고객 ]");
			Arrays.sort(Likely);
			for (int j = 0; j < cnt_l; j++)
				System.out.println(" " + Likely[j]);

			System.out.println("[ 좋은 고객 ]");
			Arrays.sort(Ideal);
			for (int j = 0; j < cnt_i; j++)
				System.out.println(" " + Ideal[j]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void secondMenuThreeItemalizeList() {

		int secondMenuThreeCategori;
		System.out.println("----------------------------------------------");
		System.out.println("[ 두번째메뉴 - 선택에 따른 오름차순 ]");
		System.out.println("1. 아이디 정렬");
		System.out.println("2. 나이 정렬");
		System.out.println("3. 성별 정렬");
		System.out.println("4. 지역 정렬");
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.print("▷ 오름차순 하고싶은 입력값을 선택하세요 : ");
		try {
			secondMenuThreeCategori = input.nextInt();
	
			// 아이디
			if (secondMenuThreeCategori == 1) {
	
				Arrays.sort(ct, new Comparator<Customer1>() { // 숫자로 시작할 경우...
					@Override
					public int compare(Customer1 o1, Customer1 o2) {
						return o1.id.compareTo(o2.id);
					}
				});
	
				for (int j = 0; j < ct.length; j++)
					System.out.println(" " + ct[j]);
				// 나이
			} else if (secondMenuThreeCategori == 2) {
	
				Arrays.sort(ct, new Comparator<Customer1>() {
					@Override
					public int compare(Customer1 o1, Customer1 o2) {
						if (o1.age > o2.age)
							return 1;
						else if (o1.age == o2.age) {
							return (o1.id.compareTo(o2.id));
						} else
							return -1;
	
					}
	
				});
	
				for (int j = 0; j < ct.length; j++)
					System.out.println(" " + ct[j]);
	
			} // 성별
			else if (secondMenuThreeCategori == 3) {
	
				String genderChoose;
	
				System.out.println("----------------------------------------------");
				System.out.println("[ 두번째메뉴 - 선택에 따른 오름차순 - 성별]");
				System.out.print("▷ 원하는 성별을 고르세요. (남자, 여자) : ");
				genderChoose = input.next();
	
				Arrays.sort(ct, new Comparator<Customer1>() {
					@Override
					public int compare(Customer1 o1, Customer1 o2) {
						if (genderChoose.equals("Female"))
							return (o2.gender.compareTo(o1.gender));
						else if (o1.gender.equals(o2.gender)) { // 성별이 동일할 경우
							if (o1.age > o2.age)
								return 1;
							else if (o1.age == o2.age) {
								return (o1.id.compareTo(o2.id));
							} else
								return -1;
						} else
							return (o1.gender.compareTo(o2.gender));
	
					}
	
				});
	
				for (int j = 0; j < ct.length; j++)
					System.out.println(" " + ct[j]);
				// 지역
			} else if (secondMenuThreeCategori == 4) {
	
				int cnt_gg = 0, cnt_gw = 0, cnt_gs = 0, cnt_cc = 0, cnt_jj = 0, cnt_jl = 0;
	
				for (int i = 0; i < ct.length; i++) {
	
					if (ct[i].getLocation().equals("GyeongGi_Do"))
						cnt_gg++;
					else if (ct[i].getLocation().equals("GangWon_Do"))
						cnt_gw++;
					else if (ct[i].getLocation().equals("GyeongSang_Do"))
						cnt_gs++;
					else if (ct[i].getLocation().equals("ChungChung_Do"))
						cnt_cc++;
					else if (ct[i].getLocation().equals("JeJu_Do"))
						cnt_jj++;
					else
						cnt_jl++;
	
				}
	
				Customer1[] longg = new Customer1[cnt_gg];
				Customer1[] longw = new Customer1[cnt_gw];
				Customer1[] longs = new Customer1[cnt_gs];
				Customer1[] loncc = new Customer1[cnt_cc];
				Customer1[] lonjj = new Customer1[cnt_jj];
				Customer1[] lonjl = new Customer1[cnt_jl];
	
				cnt_gg = 0;
				cnt_gw = 0;
				cnt_gs = 0;
				cnt_cc = 0;
				cnt_jj = 0;
				cnt_jl = 0;
	
				for (int i = 0; i < ct.length; i++) {
	
					if (ct[i].getLocation().equals("GyeongGi_Do")) {
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
				while (true) {
					int locationChoose;
					System.out.println("-----------------------------------------");
					System.out.println("[두번째 메뉴 - 선택에 따른 오름차순 - 지역 ]");
					System.out.println(" ①. 경기도");
					System.out.println(" ②. 강원도");
					System.out.println(" ③. 경상도");
					System.out.println(" ④. 충청도");
					System.out.println(" ⑤. 제주도");
					System.out.println(" ⑥. 전라도");
					System.out.println(" ⑦ 두번째 메뉴로 돌아가기 ");
					System.out.println("-----------------------------------------");
					System.out.print("▷ 정렬하고 싶은 메뉴를 고르세요 : ");
					locationChoose = input.nextInt();
	
					if (locationChoose == 1) {
						for (int i = 0; i < longg.length; i++) {
							System.out.println(longg[i]);
							continue;
						}
					} else if (locationChoose == 2) {
						for (int i = 0; i < longw.length; i++) {
							System.out.println(longw[i]);
							continue;
						}
					} else if (locationChoose == 3) {
						for (int i = 0; i < longs.length; i++) {
							System.out.println(longs[i]);
							continue;
						}
					} else if (locationChoose == 4) {
						for (int i = 0; i < loncc.length; i++) {
							System.out.println(loncc[i]);
							continue;
						}
					} else if (locationChoose == 5) {
						for (int i = 0; i < lonjj.length; i++) {
							System.out.println(lonjj[i]);
							continue;
						}
					} else if (locationChoose == 6) {
						for (int i = 0; i < lonjl.length; i++) {
							System.out.println(lonjl[i]);
							continue;
						}
					} else if (locationChoose == 7)
						break;
					else
						System.out.println("- 번호 오류 -");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	 
}
