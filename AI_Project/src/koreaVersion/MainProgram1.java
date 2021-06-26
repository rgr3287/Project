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
		while (true) { // ���� �޴� �ݺ���
			printMainMenu();
			try {
				mainmenunumber = input.nextInt();
				// �� ����
				if (mainmenunumber == 1) {
					select1();
				}
				// �� ���� ����
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
	
	public static void select1() { //�� �Է� ���� ���� �Լ�
		while(true) {
			try {
			// clearConsole();
				printFirstMenu();
				firstmenunumber = input.nextInt();
				// �� ���� �Է�
				if (firstmenunumber == 1) {
		
					// clearConsole();
					firstMenuInputCtData();
					// �� ���� ����
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
	public static void select2() { // view ���� �Լ�
		while(true) {
			// clearConsole();
			try {
				printSecondMenu();
				secondmenunumer = input.nextInt();
				// ��ü ����Ʈ
				if (secondmenunumer == 1) {
		
					Arrays.sort(ct); // Comparable implements
		
					System.out.println("\n-----[ �ι�° �޴� - ��ü �� ���� ]-----");
		
					for (int j = 0; j < ct.length; j++) {
						System.out.println(ct[j]);
					}
					System.out.println("-----------------------------------------");
					System.out.println();
		
					// Ÿ�� ����Ʈ
				} else if (secondmenunumer == 2) {
		
					// clearConsole();
					secondMenuTwoCategoriListSetStandard();
		
					// �׸�
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
		System.out.println("[ ���� �޴� ]");
		System.out.println("1. �� ���� �ϱ�");
		System.out.println("2. �� ����");
		System.out.println("3. ��� �������� ���ư���");
		System.out.println("=====================================");
		System.out.print("- ��ȣ ���� : ");

		
	}

	public static void printFirstMenu() {
		System.out.println("=====================================");
		System.out.println("[ ù��° �޴� ]");
		System.out.println(" 1. ���� �Է��ϱ�");
		System.out.println(" 2. ���� �����ϱ�");
		System.out.println(" 3. �ڷΰ���");
		System.out.println("=====================================");
		System.out.print("- ��ȣ ���� : ");

	}

	public static void printSecondMenu() {
		System.out.println("=====================================");
		System.out.println("[ �ι�° �޴� ]");
		System.out.println(" 1. ��ü �� ���� (�ð� ����)");
		System.out.println(" 2. �� �з��ϱ�");
		System.out.println(" 3. �Է°��� ���� ������������ ����");
		System.out.println(" 4. �޴� �ڷΰ���");
		System.out.println("=====================================");
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
		System.out.println("-----------------------------------------");
		System.out.println("\n[ ù��° �޴� - �� �Է��ϱ� ]");
		System.out.print("�� ����� �Է� �Ͻǰǰ���? : ");
		try {
			inputCtNumberOf = input.nextInt();

			// �� ��� ��ŭ �迭 ����� ����
			ct = new Customer1[inputCtNumberOf];
			for (i = 0; i < ct.length; i++) {
				ct[i] = new Customer1();
			}

			i = 0;
			String id = null, gen = null, loc = null;
			int age = 0, time = 0;
			String inputCtInpormationRecheck;

			while (inputCtNumberOf > i) {
				// �� ���� �ֱ�
				System.out.print("�� ���̵� : ");
				id = input.next();
				System.out.print("�� ���� : ");
				age = input.nextInt();
				System.out.print("�� ���� (���� : ����) : ");
				gen = input.next();
				System.out.print("�� ���� (���� �Է��ϼ���!) : ");
				loc = input.next();
				System.out.print("�� �̿� �ð� (��) : ");
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

				if (gen.equals("f"))
					gen = "Female";
				else if (gen.equals("m"))
					gen = "Male";
				else {
					System.out.println();
					System.out.println("- ���ڿ� ���ڸ� �����ض�! -");
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
							"- ������ ���µ� �Ͽ�..");
					System.out.println();
					continue;
				}

				// �� ���� Ȯ��
				System.out.println();
				System.out.println("-------[ ù��° �޴� - �ٽ� Ȯ���ϱ� ]-------");
				System.out.printf(
						"�� ���̵� : %s \n�� ���� : %d, ���� : %s, ���� : %s \n�� �̿�ð�(��) : %d(�ð�) \n",
						id, age, gen, loc, time);
				System.out.println("-----------------------------------------------------");

				System.out.print("�Է°��� �����Ͻǰǰ��� (�� �Ǵ� �ƴϿ�) ? : "); // inputCtInpormationRecheck //
																						// �ʱ�ȭ����
				inputCtInpormationRecheck = input.next();

				if (inputCtInpormationRecheck.equals("yes")) {
					ct[i].id = id;
					ct[i].age = age;
					ct[i].gender = gen;
					ct[i].location = loc;
					ct[i].out = time;
					i++;
					System.out.println();
					System.out.println("��������������������������������������������������\n" + "��         ��   ��        ��\n"
							+ "��������������������������������������������������");
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
				System.out.printf("\n[ %d�� ������ ���� ]-------------------------\n%s \n", j + 1, ct[j]);
			System.out.println();
			System.out.print("�� �����Ͻ� ��ݹ�ȣ�� �Է����ּ��� : ");
			deleteCtNumber = input.nextInt();
			try {
				ct[deleteCtNumber - 1] = null;

				Arrays.sort(ct); // Comparable implements
				for (int j = 0; j < ct.length; j++)
					System.out.printf("%d�� ���� ������ ���� �Ǿ����ϴ�", j + 1);

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
		System.out.println("-----[ �ι�° �޴� - �� �з��ϱ� ]-----");
		System.out.println("�� �Ȼ�� ��.. <= [ ���ð� ] < �߰� �� < [ ���ð� ] <= ���� ��");
		System.out.print("�� ù��° ���ð� �Է� : ");
		try {
			setInputStandard1 = input.nextInt();
			System.out.print("�� �ι�° ���ð� �Է� : ");
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
			System.out.println("[ �Ȼ�� ��.. ]");
			Arrays.sort(Default);
			for (int j = 0; j < cnt_d; j++)
				System.out.println(" " + Default[j]);

			System.out.println("[  �߰� �� ]");
			Arrays.sort(Likely);
			for (int j = 0; j < cnt_l; j++)
				System.out.println(" " + Likely[j]);

			System.out.println("[ ���� �� ]");
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
		System.out.println("[ �ι�°�޴� - ���ÿ� ���� �������� ]");
		System.out.println("1. ���̵� ����");
		System.out.println("2. ���� ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ����");
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.print("�� �������� �ϰ���� �Է°��� �����ϼ��� : ");
		try {
			secondMenuThreeCategori = input.nextInt();
	
			// ���̵�
			if (secondMenuThreeCategori == 1) {
	
				Arrays.sort(ct, new Comparator<Customer1>() { // ���ڷ� ������ ���...
					@Override
					public int compare(Customer1 o1, Customer1 o2) {
						return o1.id.compareTo(o2.id);
					}
				});
	
				for (int j = 0; j < ct.length; j++)
					System.out.println(" " + ct[j]);
				// ����
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
	
			} // ����
			else if (secondMenuThreeCategori == 3) {
	
				String genderChoose;
	
				System.out.println("----------------------------------------------");
				System.out.println("[ �ι�°�޴� - ���ÿ� ���� �������� - ����]");
				System.out.print("�� ���ϴ� ������ ������. (����, ����) : ");
				genderChoose = input.next();
	
				Arrays.sort(ct, new Comparator<Customer1>() {
					@Override
					public int compare(Customer1 o1, Customer1 o2) {
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
	
				for (int j = 0; j < ct.length; j++)
					System.out.println(" " + ct[j]);
				// ����
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
					System.out.println("[�ι�° �޴� - ���ÿ� ���� �������� - ���� ]");
					System.out.println(" ��. ��⵵");
					System.out.println(" ��. ������");
					System.out.println(" ��. ���");
					System.out.println(" ��. ��û��");
					System.out.println(" ��. ���ֵ�");
					System.out.println(" ��. ����");
					System.out.println(" �� �ι�° �޴��� ���ư��� ");
					System.out.println("-----------------------------------------");
					System.out.print("�� �����ϰ� ���� �޴��� ������ : ");
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
