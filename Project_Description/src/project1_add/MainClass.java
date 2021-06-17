package project1_add;

import java.util.*;

public class MainClass {// 필드에 스캐너 및 객체 생성
	static Scanner sc = new Scanner(System.in);
	static int num, choice;
	static Customer ct[] = null;
	static Customer id1[] = null;
	static Customer lk1[] = null;
	static Customer df1[] = null;

	public static void main(String[] args) { // 메인함수 : 입력삭제함수, 분류 및 전체보기 및 선택정렬, 나가기
		while (true) {
			choice = 0;
			print();
			try {
				System.out.println();
				System.out.println("choose one : ");
				choice = sc.nextInt();

				if (choice == 1) {
					select1();
				} else if (choice == 2) {
					setview();
				} else if (choice == 3) {
					break;
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}
	}

	static void print() {
		System.out.println("================");
		System.out.println("1. Customer management");
		System.out.println("2. Customer view");
		System.out.println("3. exit");
		System.out.println("================");
	}

	static void print2() {
		System.out.println("================");
		System.out.println("1. Customer InSert");
		System.out.println("2. Customer Deletion");
		System.out.println("3. Back to main");
		System.out.println("================");
	}

	static void print3() {
		System.out.println("================");
		System.out.println("1. Set Target");
		System.out.println("2. Full List View");
		System.out.println("3. ltemized view");
		System.out.println("4. Back to main");
		System.out.println("================");
	}

	static void print4() {
		System.out.println("================");
		System.out.println("1. age");
		System.out.println("2. ID");
		System.out.println("3. Location");
		System.out.println("4. Gender");
		System.out.println("5. onlineTime");
		System.out.println("6. Back");
		System.out.println("================");
	}
	
	static void print5() {
		System.out.println("================");
		System.out.println("1. age");
		System.out.println("2. ID");
		System.out.println("3. Gender");
		System.out.println("4. Location");
		System.out.println("5. Back");
		System.out.println("================");
	}

	static void select1() {// 고객 데이터 입력, 고객 데이터 삭제, 뒤로가기
		while (true) {
			print2();
			try {
				System.out.println("choose one : ");
				choice = sc.nextInt();

				if (choice == 1) {
					insert();
					break;
				} else if (choice == 2) {
					delete();
					break;
				} else if (choice == 3) {
					break;
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}

	}

	static void insert() {// 고객의 수와 선택한 데이터의 값을 입력하기
		System.out.println("Insert Customer Count?");
		try {
			num = sc.nextInt();
			ct = new Customer[num];
			id1 = new Customer[num];
			lk1 = new Customer[num];
			df1 = new Customer[num];

			for (int i = 0; i < ct.length; i++) {
				ct[i] = new Customer();

				while (i < num) {
					System.out.println(i + 1 + " 번째 손님");
					print4();
					choice = sc.nextInt();

					if (choice == 1) {
						System.out.print("input age : ");
						ct[i].age = sc.nextInt();
						continue;
					} else if (choice == 2) {
						System.out.print("input ID : ");
						ct[i].id = sc.next();
						continue;
					} else if (choice == 3) {
						System.out.print("input Location : ");
						ct[i].location = sc.next();
						continue;
					} else if (choice == 4) {
						System.out.print("input Gender : ");
						ct[i].gender = sc.next();
						continue;
					} else if (choice == 5) {
						System.out.print("input onlinetime : ");
						ct[i].onlinetime = sc.nextInt();
						continue;
					} else if (choice == 6) {
						break;
					} else {
						break;
					}
				}
			}
		} 
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}

	static void delete() {// 객체 배열의 값을 고객번호와 데이터를 선택하여 삭제하기
		while (true) {
			System.out.println("============================");
			System.out.println("고객 데이터 삭제하기");
			System.out.println("============================");
			System.out.println("Choose Customer Number : ");

			try {
				num = sc.nextInt();

				print4();
				System.out.println();
				choice = sc.nextInt();

				if (choice == 1) {
					ct[num - 1].age = 0;
					continue;
				} else if (choice == 2) {
					ct[num - 1].id = null;
					continue;
				} else if (choice == 3) {
					ct[num - 1].location = null;
					continue;
				} else if (choice == 4) {
					ct[num - 1].gender = null;
					continue;
				} else if (choice == 5) {
					ct[num - 1].onlinetime = 0;
					continue;
				} else if (choice == 6) {
					break;
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	}

	static void setview() { // 분류, 전체보기, 선택에 따른 값 오름차순하여 보기, 나가기
		while (true) {
			try {
				print3();
				System.out.println();
				System.out.println("choose one");
				choice = sc.nextInt();

				if (choice == 1) {
					settarget();
					continue;
				} else if (choice == 2) {
					fullview();
					continue;
				} else if (choice == 3) {
					Itemizedview();
					continue;
				} else if (choice == 4) {
					break;
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}
	}

	static void settarget() { // onlinetime 범위를 지정하여 분류하기
		System.out.println("============================");
		System.out.println("onlinetime 범위를 지정하여 분류하기");
		System.out.println("============================");
		System.out.println("ideal range :");
		try {
			int choice2 = sc.nextInt();
			System.out.println("likely range :");
			int choice3 = sc.nextInt();
			System.out.println("defect range : ");
			int choice4 = sc.nextInt();
	
			for (int i = 0; i < ct.length; i++) {
				if (ct[i].onlinetime >= choice2) {
					id1[i] = new Customer();
					id1[i] = ct[i];
				} else if (ct[i].onlinetime >= choice3) {
					lk1[i] = new Customer();
					lk1[i] = ct[i];
				} else if (ct[i].onlinetime >= choice4) {
					df1[i] = new Customer();
					df1[i] = ct[i];
				}
			}
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < ct.length; i++) {
			if (id1[i] != null)
				System.out.println(i + "번째 Ideal : " + id1[i]);
			if (lk1[i] != null)
				System.out.println(i + "번째 Likely : " + lk1[i]);
			if (df1[i] != null)
				System.out.println(i + "번째 defect : " + df1[i]);
		}
	}

	static void fullview() { // 전체 고객에 대한 onlinetime과 ID로 오름차순 정렬한 값
		System.out.println("==========================================");
		System.out.println("전체 고객에 대한 onlinetime과 ID로 오름차순 정렬한 값");
		System.out.println("==========================================");
		Arrays.sort(ct);
		for (int i = 0; i < ct.length; i++) {
			System.out.println(i + 1 + "번째 고객 : " + ct[i]);
		}
	}

	static void Itemizedview() { // 선택한 데이터에 따른 오름차순 정렬 보기
		while (true) {
			System.out.println("============================");
			System.out.println("선택한 번호에 따른 오름차순 정렬로 보기");
			System.out.println("============================");
			print5();
			
			try {
				System.out.println("choose one:");
				choice = sc.nextInt();
	
				if (choice == 1) {  // 나이 오름차순  
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
				         
				      for( int j = 0 ; j < ct.length ; j++) System.out.println(" " + ct[j]);   
				      
					continue;
				}
				else if(choice == 2) { //id에 따른 오름차순
				         Arrays.sort(ct, new Comparator<Customer>() { // 숫자로 시작할 경우...
				            @Override
				            public int compare(Customer o1, Customer o2) {
				               return o1.id.compareTo(o2.id);
				            }               
				         });
				         
				      for( int j = 0 ; j < ct.length ; j++) System.out.println(" " + ct[j]);
				      continue;
				} 
				else if (choice == 3) { // 성별에 따른 오름차순
			         
			         String genderChoose;
			         
			         System.out.print("■ 우선 정렬할 성별을 입력하시오 (female, male) : ");
			         genderChoose = sc.next();

			            Arrays.sort(ct, new Comparator<Customer>() {
			               @Override
			               public int compare(Customer o1, Customer o2) { 
			                  if (genderChoose.equals("Female")) return (o1.gender.compareTo(o2.gender));
			                  else if (o1.gender.equals(o2.gender)) { // 성별이 동일할 경우
			                     if (o1.age > o2.age) return 1;
			                     else if (o1.age == o2.age) {
			                        return (o1.id.compareTo(o2.id));
			                     }
			                     else return -1;
			                  }
			                  else return (o2.gender.compareTo(o1.gender));
			                  
			               }
			               
			            });
			         
			      for( int j = 0 ; j < ct.length ; j++) System.out.println(" " + ct[j]);      
			         
			         continue;
				}
				else if (choice == 4) { // 지역에 따른 오름차순
				         
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
				            }
				            else if (ct[i].getLocation().equals("GangWon_Do")) {
				               longw[cnt_gw] = ct[i];
				               cnt_gw++;
				            }
				            else if (ct[i].getLocation().equals("GyeongSang_Do")) {
				               longs[cnt_gs] = ct[i];
				               cnt_gs++;
				            }
				            else if (ct[i].getLocation().equals("ChungChung_Do")) {
				               loncc[cnt_cc] = ct[i];
				               cnt_cc++;
				            }
				            else if (ct[i].getLocation().equals("JeJu_Do")) {
				               lonjj[cnt_jj] = ct[i];
				               cnt_jj++;
				            }
				            else {
				               lonjl[cnt_jl] = ct[i];
				               cnt_jl++;
				            }
				         }
				         
				         int locationChoose;      
				         
				         System.out.println("1. GyeongGi_Do");
				         System.out.println("2. GangWon_Do");
				         System.out.println("3. GyeongSang_Do");
				         System.out.println("4. ChungChung_Do");
				         System.out.println("5. JeJu_Do");
				         System.out.println("6. JeolLa_Do");
				         System.out.print("■ 우선 정렬 할 지역을 입력하시오 : ");
				         locationChoose = sc.nextInt();
				         
				         if(locationChoose == 1) {
				            for ( int i = 0 ; i < longg.length ; i ++) System.out.println(longg[i]);
				         }
				         else if(locationChoose == 2) {
				            for ( int i = 0 ; i < longw.length ; i ++) System.out.println(longw[i]);
				         }
				         else if(locationChoose == 3) {
				            for ( int i = 0 ; i < longs.length ; i ++) System.out.println(longs[i]);
				         }
				         else if(locationChoose == 4) {
				            for ( int i = 0 ; i < loncc.length ; i ++) System.out.println(loncc[i]);
				         }
				         else if(locationChoose == 5) {
				            for ( int i = 0 ; i < lonjj.length ; i ++) System.out.println(lonjj[i]);
				         }
				         else if(locationChoose == 6) {
				            for ( int i = 0 ; i < lonjl.length ; i ++) System.out.println(lonjl[i]);
				         }
				         else System.out.println("- number error -");
				    
				} else if (choice == 5) {
					break;
				} else {
					break;
				}
			}
			catch(InputMismatchException e) {
				e.printStackTrace();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	}
}
