package koreaVersion;

import java.util.*;

public class KoreaMain {

	static Scanner input = new Scanner(System.in);

	static String mainmenunumber;
	static String firstmenunumber;
	static String secondmenunumer;

	static KoreaCustomer ct[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		korean();

	}
	public static void korean() {
		while (true) { // 메인 메뉴 반복문
			printMainMenu();
			try {
				mainmenunumber = input.next();
				// 고객 관리
				if (Integer.parseInt(mainmenunumber) == 1) {
					select1();
				}
				// 고객 정보 보기
				else if (Integer.parseInt(mainmenunumber) == 2) {
					select2();
				} else if (Integer.parseInt(mainmenunumber) == 3) break;
			      else printError();
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
				firstmenunumber = input.next();
				// 고객 정보 입력
				if (Integer.parseInt(firstmenunumber) == 1) {
		
					// clearConsole();
					firstMenuInputCtData();
					// 고객 정보 삭제
				} else if (Integer.parseInt(firstmenunumber) == 2) {
		
					// clearConsole();
					firstMenuDeletCtData();
		
				} else if (Integer.parseInt(firstmenunumber) == 3) break;
				else printError();
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
				secondmenunumer = input.next();
				// 전체 리스트
				if (Integer.parseInt(secondmenunumer) == 1) {
		
					Arrays.sort(ct); // Comparable implements
					System.out.println("\n---------------[ 두번째창 - 전체보기 ]-----------------");
					for (int j = 0; j < ct.length; j++) {
						System.out.println(ct[j]);
						System.out.println("---------------------------------------------------");
					}
					System.out.println();
		
					// 타겟 리스트
				} else if (Integer.parseInt(secondmenunumer) == 2) {
		
					// clearConsole();
					secondMenuTwoCategoriListSetStandard();
		
					// 항목별
				} else if (Integer.parseInt(secondmenunumer) == 3) {
		
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
		for (int i = 0; i < 60; i++) {
			System.out.println();
		}
	}

	public static void printMainMenu() {
		clearConsole();
		System.out.println("===================================================");
		System.out.println("[ 주 메뉴 ]");
		System.out.println("1. 고객 정보 관리");
		System.out.println("2. 고객 정보 보기");
		System.out.println("3. 한국어 프로그램 종료");
		System.out.println("===================================================");
		System.out.print("- 번호 선택 : ");
		
	}

	public static void printFirstMenu() {
		clearConsole();
		System.out.println("===================================================");
		System.out.println("[ 고객 정보 관리 ]");
		System.out.println(" 1. 고객 입력하기");
		System.out.println(" 2. 고객 삭제하기");
		System.out.println(" 3. 주 메뉴로 돌아가기");
		System.out.println("===================================================");
		System.out.print("- 번호 선택 : ");
		
	}

	public static void printSecondMenu() {
		clearConsole();
		System.out.println("===================================================");
		System.out.println("[ 고객 정보 보기 ]");
		System.out.println(" 1. 전체 보기 (시간 정렬)");
		System.out.println(" 2. 고객 분류하기");
		System.out.println(" 3. 항목별 보기 (오름차순 정렬)");
		System.out.println(" 4. 주 메뉴로 돌아가기");
		System.out.println("===================================================");
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
		  	
		System.out.println("\n-------------[ 고객 정보 관리 - 고객 입력 ]--------------");
		System.out.print("\n◆ 몇 명을 입력 하시겠습니까? : ");
		try {
			inputCtNumberOf = input.nextInt();

			// 고객 명수 만큼 배열 만들기 과정
			ct = new KoreaCustomer[inputCtNumberOf];
			for (i = 0; i < ct.length; i++) {
				ct[i] = new KoreaCustomer();
			}

			i = 0;
			String id = null, gen = null, loc = null;
			int age = 0, time = 0;
			String inputCtInpormationRecheck;

			while (inputCtNumberOf > i) {
				// 고객 정보 넣기
				System.out.println();
				System.out.print("▷ 아이디 : ");
				id = input.next();
				System.out.print("▷ 나이 : ");
				age = input.nextInt();
				System.out.print("▷ 성별 (남자 : 여자) : ");
				gen = input.next();
				System.out.print("▷ 지역 (도청 기준) : ");
				loc = input.next();
				System.out.print("▷ 이용 시간 (단위 : 시) : ");
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

				if (gen.equals("여자") || gen.equals("여") )
					gen = "여자";
				else if (gen.equals("남자") || gen.equals("남"))
					gen = "남자";
				else {
					System.out.println();
					System.out.println("- 남자와 여자 중에 선택하시오! -");
					System.out.println();
					continue;
				}

				
				if (loc.equals("경기도") || loc.equals("경기") )
					loc = "경기도";
				else if (loc.equals("강원도") || loc.equals("강원") )
					loc = "강원도";
				else if (loc.equals("경상도") || loc.equals("경상") || loc.equals("경상남도")|| loc.equals("경상북도"))
					loc = "경상도";
				else if (loc.equals("충청도") || loc.equals("충청") )
					loc = "충청도";
				else if (loc.equals("제주도") || loc.equals("제주") )
					loc = "제주도";
				else if (loc.equals("전라도") || loc.equals("전라") || loc.equals("전라남도") || loc.equals("전라북도") )
					loc = "전라도";
				else {
					System.out.println();
					System.out.println(
							"- 지역 입력 (오류 도청 기준) -");
					System.out.println();
					continue;
				}

				// 고객 정보 확인
				  
				System.out.println("\n-------[ 고객 정보 관리 - 고객 정보 다시 확인하기 ]---------");
				System.out.printf("▶ [ID] %s [지역] %s \n  [나이] %d [성별] %s \n  [인터넷 사용시간(매월 몇 시간)] %d(h) \n", id, loc, age, gen, time);
				System.out.println("---------------------------------------------------");

				System.out.print("입력값을 저장하실건가요 (네 or 아니요) ? : "); // inputCtInpormationRecheck //
																						// 초기화까지
				inputCtInpormationRecheck = input.next();

				if (inputCtInpormationRecheck.equals("네")) {
					ct[i].id = id;
					ct[i].age = age;
					ct[i].gender = gen;
					ct[i].location = loc;
					ct[i].out = time;
					i++;
					System.out.println();
					System.out.println("┌───────────────────────┐\n" 
									 + "│       성공하였습니다      │\n"
									 + "└───────────────────────┘");
					System.out.println();
					continue;
				} else if (inputCtInpormationRecheck.equals("아니요"))
					continue;
				else {
					System.out.println("\n- 네 or 아니오 값을 입력하시오 -\n");
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
			for (int j = 0; j < ct.length; j++) {
				System.out.printf("\n[ %d번 고객 정보 ]---------------------------------\n%s \n", j + 1, ct[j]);
				 System.out.println("---------------------------------------------------");
			}
			
			System.out.print("- 삭제하실 고객번호를 입력해주세요 (종료 -1) : ");
			deleteCtNumber = input.nextInt();
			try {
				if (deleteCtNumber == -1) break;
				ct[deleteCtNumber - 1] = null;

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

		KoreaCustomer[] Default;
		KoreaCustomer[] Likely;
		KoreaCustomer[] Ideal;

		int cnt_d = 0, cnt_l = 0, cnt_i = 0;
		
		System.out.println("\n---------------[ 두번째 창 - 분류하기 ]--------------");
		System.out.println("▷ 일반 고객 <= [ 가 ] < 우수 고객 < [ 나 ] <= 최우수 고객");		
		try {
			System.out.print("▷ '가' 기준 값 : ");
			setInputStandard1 = input.nextInt();
			System.out.print("▷ '나' 기준 값 : ");
			setInputStandard2 = input.nextInt();
			System.out.println("---------------------------------------------------\n");
			
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

			Default = new KoreaCustomer[cnt_d];
			Likely = new KoreaCustomer[cnt_l];
			Ideal = new KoreaCustomer[cnt_i];

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
			if (cnt_d != 0) {
				
				System.out.println("< 일반 고객 모음 >------------------------------------");
				Arrays.sort(Default);
				for( int j = 0 ; j < cnt_d ; j++) System.out.println(Default[j]);
				System.out.println("---------------------------------------------------");
				
			} else System.out.println("< 일반 고객 모음 >------------------------------------\n- 없음 -\n---------------------------------------------------");
			if (cnt_l != 0) {
				
				System.out.println("< 우수 고객 모음 >------------------------------------");
				Arrays.sort(Likely);
				for( int j = 0 ; j < cnt_l ; j++) System.out.println(Likely[j]);
				System.out.println("---------------------------------------------------");
			} else System.out.println("< 우수 고객 모음 >------------------------------------\n- 없음 -\n---------------------------------------------------");
			if (cnt_i != 0) {
				
				System.out.println("< 최우수 고객 모음  >----------------------------------");
				Arrays.sort(Ideal);
				for( int j = 0 ; j < cnt_i ; j++) System.out.println(Ideal[j]);
				System.out.println("---------------------------------------------------\n");
			} else System.out.println("< 최우수 고객 모음 >-----------------------------------\n- 없음 -\n---------------------------------------------------\n");
			
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
		  
		System.out.println("\n-----[ 고객 정보 보기 - 항목별 보기 (오름차순 정렬) ]-------");
		System.out.println("  1. 아이디 정렬");
		System.out.println("  2. 나이 정렬");
		System.out.println("  3. 성별 정렬");
		System.out.println("  4. 지역 정렬");
		System.out.println("  5. 고객 정보 보기로 돌아가기 ");
		System.out.println("---------------------------------------------------");
		System.out.print("- 정렬 기준 값을 선택하세요 : ");
		try {
			secondMenuThreeCategori = input.nextInt();
	
			// 아이디
			if (secondMenuThreeCategori == 1) {
	
				Arrays.sort(ct, new Comparator<KoreaCustomer>() { // 숫자로 시작할 경우...
					@Override
					public int compare(KoreaCustomer o1, KoreaCustomer o2) {
						return o1.id.compareTo(o2.id);
					}
				});
				
				System.out.println("\n< 고객 정보 보기 - ID 정렬 목록 >--------------------");
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);	
				  System.out.println("---------------------------------------------------");
				// 나이
			} else if (secondMenuThreeCategori == 2) {
	
				Arrays.sort(ct, new Comparator<KoreaCustomer>() {
					@Override
					public int compare(KoreaCustomer o1, KoreaCustomer o2) {
						if (o1.age > o2.age)
							return 1;
						else if (o1.age == o2.age) {
							return (o1.id.compareTo(o2.id));
						} else
							return -1;
	
					}
	
				});
	
				System.out.println("\n< 고객 정보 보기 - 나이 정렬 목록 >-------------------");
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);
				  System.out.println("---------------------------------------------------");
	
			} // 성별
			else if (secondMenuThreeCategori == 3) {
	
				String genderChoose;
	
				System.out.println("\n< 고객 정보 보기 - 성별 정렬 목록 (오름차순) >----------------");
				System.out.print("- 우선 정렬할 성별을 고르세요. (남자, 여자) : ");
				genderChoose = input.next();
	
				Arrays.sort(ct, new Comparator<KoreaCustomer>() {
					@Override
					public int compare(KoreaCustomer o1, KoreaCustomer o2) {
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
	
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);
				System.out.println("---------------------------------------------------");
				// 지역
			} else if (secondMenuThreeCategori == 4) {
	
				int cnt_gg = 0, cnt_gw = 0, cnt_gs = 0, cnt_cc = 0, cnt_jj = 0, cnt_jl = 0;
	
				for (int i = 0; i < ct.length; i++) {
	
					if (ct[i].getLocation().equals("경기도"))
						cnt_gg++;
					else if (ct[i].getLocation().equals("강원도"))
						cnt_gw++;
					else if (ct[i].getLocation().equals("경상도"))
						cnt_gs++;
					else if (ct[i].getLocation().equals("충청도"))
						cnt_cc++;
					else if (ct[i].getLocation().equals("제주도"))
						cnt_jj++;
					else
						cnt_jl++;
	
				}
	
				KoreaCustomer[] longg = new KoreaCustomer[cnt_gg];
				KoreaCustomer[] longw = new KoreaCustomer[cnt_gw];
				KoreaCustomer[] longs = new KoreaCustomer[cnt_gs];
				KoreaCustomer[] loncc = new KoreaCustomer[cnt_cc];
				KoreaCustomer[] lonjj = new KoreaCustomer[cnt_jj];
				KoreaCustomer[] lonjl = new KoreaCustomer[cnt_jl];
	
				cnt_gg = 0;
				cnt_gw = 0;
				cnt_gs = 0;
				cnt_cc = 0;
				cnt_jj = 0;
				cnt_jl = 0;
	
				for (int i = 0; i < ct.length; i++) {
	
					if (ct[i].getLocation().equals("경기도")) {
						longg[cnt_gg] = ct[i];
						cnt_gg++;
					} else if (ct[i].getLocation().equals("강원도")) {
						longw[cnt_gw] = ct[i];
						cnt_gw++;
					} else if (ct[i].getLocation().equals("경상도")) {
						longs[cnt_gs] = ct[i];
						cnt_gs++;
					} else if (ct[i].getLocation().equals("충청도")) {
						loncc[cnt_cc] = ct[i];
						cnt_cc++;
					} else if (ct[i].getLocation().equals("제주도")) {
						lonjj[cnt_jj] = ct[i];
						cnt_jj++;
					} else {
						lonjl[cnt_jl] = ct[i];
						cnt_jl++;
					}
				}
				while (true) {
					int locationChoose;
					  
					System.out.println("\n< 고객 정보 보기 - 지역 정렬 목록 >----------------------");
					System.out.println("  1. 경기도");
					System.out.println("  2. 강원도");
					System.out.println("  3. 경상도");
					System.out.println("  4. 충청도");
					System.out.println("  5. 제주도");
					System.out.println("  6. 전라도");
					System.out.println("  7. 고객 정보 보기로 돌아가기 ");
					System.out.println("---------------------------------------------------");
					System.out.print("▷ 정렬하고 싶은 메뉴를 고르세요 : ");
					locationChoose = input.nextInt();
	
					if (locationChoose == 1) {
						if (cnt_gg != 0) {
							  
							System.out.println("\n< 고객 정보 보기 - 경기도 정렬 목록 >---------------------");
							for ( int i = 0 ; i < longg.length ; i ++) System.out.println(longg[i]);
							  System.out.println("---------------------------------------------------");	
						} else { 
							System.out.println("\n< 고객 정보 보기 - 경기도 정렬 목록 >---------------------\n- 없음 -");
							System.out.println("---------------------------------------------------");		
						}
					} else if (locationChoose == 2) {
						if (cnt_gw != 0) {
							
							System.out.println("\n< 고객 정보 보기 - 강원도 정렬 목록 >---------------------");
							for ( int i = 0 ; i < longw.length ; i ++) System.out.println(longw[i]);
						} else { 
							System.out.println("\n< 고객 정보 보기 - 강원도 정렬 목록 >---------------------\n- 없음 -");
							  System.out.println("---------------------------------------------------");	
						}
					} else if (locationChoose == 3) {
						if (cnt_gs != 0) {
							
							System.out.println("\n< 고객 정보 보기 - 경상도 정렬 목록 >---------------------");
							for ( int i = 0 ; i < longs.length ; i ++) System.out.println(longs[i]);
							  System.out.println("---------------------------------------------------");
							continue;
						} else { 
							System.out.println("\n< 고객 정보 보기 - 경상도 정렬 목록  >---------------------\n- 없음 -");
							  System.out.println("---------------------------------------------------");						
						}
					} else if (locationChoose == 4) {
						if (cnt_cc != 0) {
							  
							System.out.println("\n< 고객 정보 보기 - 충청도 정렬 목록 >---------------------");
							for ( int i = 0 ; i < loncc.length ; i ++) System.out.println(loncc[i]);
						} else { 
							System.out.println("\n< 고객 정보 보기 - 충청도 정렬 목록 >---------------------\n- 없음 -");
							  System.out.println("---------------------------------------------------");		
						}	
					} else if (locationChoose == 5) {
						if (cnt_jj != 0) {
							  
							System.out.println("\n< 고객 정보 보기 - 제주도 정렬 목록 >---------------------");
							for ( int i = 0 ; i < lonjj.length ; i ++) System.out.println(lonjj[i]);
						} else { 
							System.out.println("\n< 고객 정보 보기 - 제주도 정렬 목록 >---------------------\n- Empty -");
							  System.out.println("---------------------------------------------------");		
						}	
					} else if (locationChoose == 6) {
						if(cnt_jl != 0) {
							 
							System.out.println("\n< 고객 정보 보기 - 전라도 정렬 목록 >---------------------");
							for ( int i = 0 ; i < lonjl.length ; i ++) System.out.println(lonjl[i]);
						} else { 
							System.out.println("\n< 고객 정보 보기 - 전라도 정렬 목록 >---------------------\n- Empty -");
							  System.out.println("---------------------------------------------------");		
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
