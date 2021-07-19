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
		while (true) { // ���� �޴� �ݺ���
			printMainMenu();
			try {
				mainmenunumber = input.next();
				// �� ����
				if (Integer.parseInt(mainmenunumber) == 1) {
					select1();
				}
				// �� ���� ����
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
	
	public static void select1() { //�� �Է� ���� ���� �Լ�
		while(true) {
			try {
			// clearConsole();
				printFirstMenu();
				firstmenunumber = input.next();
				// �� ���� �Է�
				if (Integer.parseInt(firstmenunumber) == 1) {
		
					// clearConsole();
					firstMenuInputCtData();
					// �� ���� ����
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
	public static void select2() { // view ���� �Լ�
		while(true) {
			// clearConsole();
			try {
				printSecondMenu();
				secondmenunumer = input.next();
				// ��ü ����Ʈ
				if (Integer.parseInt(secondmenunumer) == 1) {
		
					Arrays.sort(ct); // Comparable implements
					System.out.println("\n---------------[ �ι�°â - ��ü���� ]-----------------");
					for (int j = 0; j < ct.length; j++) {
						System.out.println(ct[j]);
						System.out.println("---------------------------------------------------");
					}
					System.out.println();
		
					// Ÿ�� ����Ʈ
				} else if (Integer.parseInt(secondmenunumer) == 2) {
		
					// clearConsole();
					secondMenuTwoCategoriListSetStandard();
		
					// �׸�
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
		System.out.println("[ �� �޴� ]");
		System.out.println("1. �� ���� ����");
		System.out.println("2. �� ���� ����");
		System.out.println("3. �ѱ��� ���α׷� ����");
		System.out.println("===================================================");
		System.out.print("- ��ȣ ���� : ");
		
	}

	public static void printFirstMenu() {
		clearConsole();
		System.out.println("===================================================");
		System.out.println("[ �� ���� ���� ]");
		System.out.println(" 1. �� �Է��ϱ�");
		System.out.println(" 2. �� �����ϱ�");
		System.out.println(" 3. �� �޴��� ���ư���");
		System.out.println("===================================================");
		System.out.print("- ��ȣ ���� : ");
		
	}

	public static void printSecondMenu() {
		clearConsole();
		System.out.println("===================================================");
		System.out.println("[ �� ���� ���� ]");
		System.out.println(" 1. ��ü ���� (�ð� ����)");
		System.out.println(" 2. �� �з��ϱ�");
		System.out.println(" 3. �׸� ���� (�������� ����)");
		System.out.println(" 4. �� �޴��� ���ư���");
		System.out.println("===================================================");
		System.out.print("- ��ȣ ���� : ");
		
	}

	public static void printError() {
		System.out.println();
		System.out.println("- ��ȣ ���� -");
		System.out.println();
	}

	public static void firstMenuInputCtData() {

		int inputCtNumberOf;
		int i; // �� �迭��
		  	
		System.out.println("\n-------------[ �� ���� ���� - �� �Է� ]--------------");
		System.out.print("\n�� �� ���� �Է� �Ͻðڽ��ϱ�? : ");
		try {
			inputCtNumberOf = input.nextInt();

			// �� ��� ��ŭ �迭 ����� ����
			ct = new KoreaCustomer[inputCtNumberOf];
			for (i = 0; i < ct.length; i++) {
				ct[i] = new KoreaCustomer();
			}

			i = 0;
			String id = null, gen = null, loc = null;
			int age = 0, time = 0;
			String inputCtInpormationRecheck;

			while (inputCtNumberOf > i) {
				// �� ���� �ֱ�
				System.out.println();
				System.out.print("�� ���̵� : ");
				id = input.next();
				System.out.print("�� ���� : ");
				age = input.nextInt();
				System.out.print("�� ���� (���� : ����) : ");
				gen = input.next();
				System.out.print("�� ���� (��û ����) : ");
				loc = input.next();
				System.out.print("�� �̿� �ð� (���� : ��) : ");
				time = input.nextInt();

				if (age <= 13 || age > 100) {
					System.out.println();
					System.out.println("- ��ȣ�ڰ� �ʿ��մϴ�. -");
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

				if (gen.equals("����") || gen.equals("��") )
					gen = "����";
				else if (gen.equals("����") || gen.equals("��"))
					gen = "����";
				else {
					System.out.println();
					System.out.println("- ���ڿ� ���� �߿� �����Ͻÿ�! -");
					System.out.println();
					continue;
				}

				
				if (loc.equals("��⵵") || loc.equals("���") )
					loc = "��⵵";
				else if (loc.equals("������") || loc.equals("����") )
					loc = "������";
				else if (loc.equals("���") || loc.equals("���") || loc.equals("��󳲵�")|| loc.equals("���ϵ�"))
					loc = "���";
				else if (loc.equals("��û��") || loc.equals("��û") )
					loc = "��û��";
				else if (loc.equals("���ֵ�") || loc.equals("����") )
					loc = "���ֵ�";
				else if (loc.equals("����") || loc.equals("����") || loc.equals("���󳲵�") || loc.equals("����ϵ�") )
					loc = "����";
				else {
					System.out.println();
					System.out.println(
							"- ���� �Է� (���� ��û ����) -");
					System.out.println();
					continue;
				}

				// �� ���� Ȯ��
				  
				System.out.println("\n-------[ �� ���� ���� - �� ���� �ٽ� Ȯ���ϱ� ]---------");
				System.out.printf("�� [ID] %s [����] %s \n  [����] %d [����] %s \n  [���ͳ� ���ð�(�ſ� �� �ð�)] %d(h) \n", id, loc, age, gen, time);
				System.out.println("---------------------------------------------------");

				System.out.print("�Է°��� �����Ͻǰǰ��� (�� or �ƴϿ�) ? : "); // inputCtInpormationRecheck //
																						// �ʱ�ȭ����
				inputCtInpormationRecheck = input.next();

				if (inputCtInpormationRecheck.equals("��")) {
					ct[i].id = id;
					ct[i].age = age;
					ct[i].gender = gen;
					ct[i].location = loc;
					ct[i].out = time;
					i++;
					System.out.println();
					System.out.println("��������������������������������������������������\n" 
									 + "��       �����Ͽ����ϴ�      ��\n"
									 + "��������������������������������������������������");
					System.out.println();
					continue;
				} else if (inputCtInpormationRecheck.equals("�ƴϿ�"))
					continue;
				else {
					System.out.println("\n- �� or �ƴϿ� ���� �Է��Ͻÿ� -\n");
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
				System.out.printf("\n[ %d�� �� ���� ]---------------------------------\n%s \n", j + 1, ct[j]);
				 System.out.println("---------------------------------------------------");
			}
			
			System.out.print("- �����Ͻ� ����ȣ�� �Է����ּ��� (���� -1) : ");
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
		
		System.out.println("\n---------------[ �ι�° â - �з��ϱ� ]--------------");
		System.out.println("�� �Ϲ� �� <= [ �� ] < ��� �� < [ �� ] <= �ֿ�� ��");		
		try {
			System.out.print("�� '��' ���� �� : ");
			setInputStandard1 = input.nextInt();
			System.out.print("�� '��' ���� �� : ");
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
				
				System.out.println("< �Ϲ� �� ���� >------------------------------------");
				Arrays.sort(Default);
				for( int j = 0 ; j < cnt_d ; j++) System.out.println(Default[j]);
				System.out.println("---------------------------------------------------");
				
			} else System.out.println("< �Ϲ� �� ���� >------------------------------------\n- ���� -\n---------------------------------------------------");
			if (cnt_l != 0) {
				
				System.out.println("< ��� �� ���� >------------------------------------");
				Arrays.sort(Likely);
				for( int j = 0 ; j < cnt_l ; j++) System.out.println(Likely[j]);
				System.out.println("---------------------------------------------------");
			} else System.out.println("< ��� �� ���� >------------------------------------\n- ���� -\n---------------------------------------------------");
			if (cnt_i != 0) {
				
				System.out.println("< �ֿ�� �� ����  >----------------------------------");
				Arrays.sort(Ideal);
				for( int j = 0 ; j < cnt_i ; j++) System.out.println(Ideal[j]);
				System.out.println("---------------------------------------------------\n");
			} else System.out.println("< �ֿ�� �� ���� >-----------------------------------\n- ���� -\n---------------------------------------------------\n");
			
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
		  
		System.out.println("\n-----[ �� ���� ���� - �׸� ���� (�������� ����) ]-------");
		System.out.println("  1. ���̵� ����");
		System.out.println("  2. ���� ����");
		System.out.println("  3. ���� ����");
		System.out.println("  4. ���� ����");
		System.out.println("  5. �� ���� ����� ���ư��� ");
		System.out.println("---------------------------------------------------");
		System.out.print("- ���� ���� ���� �����ϼ��� : ");
		try {
			secondMenuThreeCategori = input.nextInt();
	
			// ���̵�
			if (secondMenuThreeCategori == 1) {
	
				Arrays.sort(ct, new Comparator<KoreaCustomer>() { // ���ڷ� ������ ���...
					@Override
					public int compare(KoreaCustomer o1, KoreaCustomer o2) {
						return o1.id.compareTo(o2.id);
					}
				});
				
				System.out.println("\n< �� ���� ���� - ID ���� ��� >--------------------");
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);	
				  System.out.println("---------------------------------------------------");
				// ����
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
	
				System.out.println("\n< �� ���� ���� - ���� ���� ��� >-------------------");
				for( int j = 0 ; j < ct.length ; j++) System.out.println(ct[j]);
				  System.out.println("---------------------------------------------------");
	
			} // ����
			else if (secondMenuThreeCategori == 3) {
	
				String genderChoose;
	
				System.out.println("\n< �� ���� ���� - ���� ���� ��� (��������) >----------------");
				System.out.print("- �켱 ������ ������ ������. (����, ����) : ");
				genderChoose = input.next();
	
				Arrays.sort(ct, new Comparator<KoreaCustomer>() {
					@Override
					public int compare(KoreaCustomer o1, KoreaCustomer o2) {
						if (genderChoose.equals("Female"))
							return (o2.gender.compareTo(o1.gender));
						else if (o1.gender.equals(o2.gender)) { // ������ ������ ���
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
				// ����
			} else if (secondMenuThreeCategori == 4) {
	
				int cnt_gg = 0, cnt_gw = 0, cnt_gs = 0, cnt_cc = 0, cnt_jj = 0, cnt_jl = 0;
	
				for (int i = 0; i < ct.length; i++) {
	
					if (ct[i].getLocation().equals("��⵵"))
						cnt_gg++;
					else if (ct[i].getLocation().equals("������"))
						cnt_gw++;
					else if (ct[i].getLocation().equals("���"))
						cnt_gs++;
					else if (ct[i].getLocation().equals("��û��"))
						cnt_cc++;
					else if (ct[i].getLocation().equals("���ֵ�"))
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
	
					if (ct[i].getLocation().equals("��⵵")) {
						longg[cnt_gg] = ct[i];
						cnt_gg++;
					} else if (ct[i].getLocation().equals("������")) {
						longw[cnt_gw] = ct[i];
						cnt_gw++;
					} else if (ct[i].getLocation().equals("���")) {
						longs[cnt_gs] = ct[i];
						cnt_gs++;
					} else if (ct[i].getLocation().equals("��û��")) {
						loncc[cnt_cc] = ct[i];
						cnt_cc++;
					} else if (ct[i].getLocation().equals("���ֵ�")) {
						lonjj[cnt_jj] = ct[i];
						cnt_jj++;
					} else {
						lonjl[cnt_jl] = ct[i];
						cnt_jl++;
					}
				}
				while (true) {
					int locationChoose;
					  
					System.out.println("\n< �� ���� ���� - ���� ���� ��� >----------------------");
					System.out.println("  1. ��⵵");
					System.out.println("  2. ������");
					System.out.println("  3. ���");
					System.out.println("  4. ��û��");
					System.out.println("  5. ���ֵ�");
					System.out.println("  6. ����");
					System.out.println("  7. �� ���� ����� ���ư��� ");
					System.out.println("---------------------------------------------------");
					System.out.print("�� �����ϰ� ���� �޴��� ������ : ");
					locationChoose = input.nextInt();
	
					if (locationChoose == 1) {
						if (cnt_gg != 0) {
							  
							System.out.println("\n< �� ���� ���� - ��⵵ ���� ��� >---------------------");
							for ( int i = 0 ; i < longg.length ; i ++) System.out.println(longg[i]);
							  System.out.println("---------------------------------------------------");	
						} else { 
							System.out.println("\n< �� ���� ���� - ��⵵ ���� ��� >---------------------\n- ���� -");
							System.out.println("---------------------------------------------------");		
						}
					} else if (locationChoose == 2) {
						if (cnt_gw != 0) {
							
							System.out.println("\n< �� ���� ���� - ������ ���� ��� >---------------------");
							for ( int i = 0 ; i < longw.length ; i ++) System.out.println(longw[i]);
						} else { 
							System.out.println("\n< �� ���� ���� - ������ ���� ��� >---------------------\n- ���� -");
							  System.out.println("---------------------------------------------------");	
						}
					} else if (locationChoose == 3) {
						if (cnt_gs != 0) {
							
							System.out.println("\n< �� ���� ���� - ��� ���� ��� >---------------------");
							for ( int i = 0 ; i < longs.length ; i ++) System.out.println(longs[i]);
							  System.out.println("---------------------------------------------------");
							continue;
						} else { 
							System.out.println("\n< �� ���� ���� - ��� ���� ���  >---------------------\n- ���� -");
							  System.out.println("---------------------------------------------------");						
						}
					} else if (locationChoose == 4) {
						if (cnt_cc != 0) {
							  
							System.out.println("\n< �� ���� ���� - ��û�� ���� ��� >---------------------");
							for ( int i = 0 ; i < loncc.length ; i ++) System.out.println(loncc[i]);
						} else { 
							System.out.println("\n< �� ���� ���� - ��û�� ���� ��� >---------------------\n- ���� -");
							  System.out.println("---------------------------------------------------");		
						}	
					} else if (locationChoose == 5) {
						if (cnt_jj != 0) {
							  
							System.out.println("\n< �� ���� ���� - ���ֵ� ���� ��� >---------------------");
							for ( int i = 0 ; i < lonjj.length ; i ++) System.out.println(lonjj[i]);
						} else { 
							System.out.println("\n< �� ���� ���� - ���ֵ� ���� ��� >---------------------\n- Empty -");
							  System.out.println("---------------------------------------------------");		
						}	
					} else if (locationChoose == 6) {
						if(cnt_jl != 0) {
							 
							System.out.println("\n< �� ���� ���� - ���� ���� ��� >---------------------");
							for ( int i = 0 ; i < lonjl.length ; i ++) System.out.println(lonjl[i]);
						} else { 
							System.out.println("\n< �� ���� ���� - ���� ���� ��� >---------------------\n- Empty -");
							  System.out.println("---------------------------------------------------");		
						}	 
					} else if (locationChoose == 7)
						break;
					else
						System.out.println("- ��ȣ ���� -");
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
