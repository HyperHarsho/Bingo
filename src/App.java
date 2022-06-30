import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static int bTable[];
    public static int pTable[];
    public static int eff = 0;
    public static int bbingo = 0;
    public static int pbingo = 0;
    public static HashMap<String, Integer> bcom = new HashMap<>();
    public static HashMap<String, Integer> pcom = new HashMap<>();
    public static HashMap<String, Integer> hir = new HashMap<>();
    public static Random rndm = new Random();

    App() {
        // Hierarchy
        hir.put("d1", rndm.nextInt(4));
        hir.put("d2", rndm.nextInt(4));
        hir.put("c0", rndm.nextInt(4));
        hir.put("c4", rndm.nextInt(4));
        hir.put("r0", rndm.nextInt(4));
        hir.put("r4", rndm.nextInt(4));
        hir.put("r1", rndm.nextInt(4));
        hir.put("r3", rndm.nextInt(4));
        hir.put("c1", rndm.nextInt(4));
        hir.put("c3", rndm.nextInt(4));
        hir.put("r2", rndm.nextInt(4));
        hir.put("c2", rndm.nextInt(4));
    }

    // Print table
    public static String prTable(int table[]) {
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < table.length; j++) {
            if (j == 4 || j == 9 || j == 14 || j == 19 || j == 24) {
                if (table[j] == 42) {
                    s.append((char) table[j] + "\t\n");
                } else {
                    s.append(table[j] + "\t\n");
                }
            } else {
                if (table[j] == 42) {
                    s.append((char) table[j] + "\t");
                } else {
                    s.append(table[j] + "\t");
                }
            }
        }
        return s.toString();
    }

    // Check completed
    public static void cCon(int table[], boolean real, int map) {
        int cc = 0;
        for (int i = 0; i < table.length; i++) {
            cc = 0;
            switch (i) {
                case 0:
                    // R0:
                    for (int j = 0; j < 5; j++) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("r0", cc);
                        if (map == 0)
                            pcom.put("r0", cc);
                    }
                    // C0:
                    cc = 0;
                    for (int j = 0; j < 21; j += 5) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("c0", cc);
                        if (map == 0)
                            pcom.put("c0", cc);
                    }
                    // D1:
                    cc = 0;
                    for (int j = 0; j < 25; j += 6) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("d1", cc);
                        if (map == 0)
                            pcom.put("d1", cc);
                    }
                    break;
                case 1:
                    // C1:
                    for (int j = 1; j < 22; j += 5) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("c1", cc);
                        if (map == 0)
                            pcom.put("c1", cc);
                    }
                    break;
                case 2:
                    // C2:
                    for (int j = 2; j < 23; j += 5) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("c2", cc);
                        if (map == 0)
                            pcom.put("c2", cc);
                    }
                    break;
                case 3:
                    // C3:
                    for (int j = 3; j < 24; j += 5) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("c3", cc);
                        if (map == 0)
                            pcom.put("c3", cc);
                    }
                    break;
                case 4:
                    // C4:
                    for (int j = 4; j < 25; j += 5) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("c4", cc);
                        if (map == 0)
                            pcom.put("c4", cc);
                    }
                    // D2:
                    cc = 0;
                    for (int j = 4; j < 21; j += 4) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("d2", cc);
                        if (map == 0)
                            pcom.put("d2", cc);
                    }
                    break;
                case 5:
                    // R1:
                    for (int j = 5; j < 10; j++) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("r1", cc);
                        if (map == 0)
                            pcom.put("r1", cc);
                    }
                    break;
                case 10:
                    // R2:
                    for (int j = 10; j < 15; j++) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("r2", cc);
                        if (map == 0)
                            pcom.put("r2", cc);
                    }
                    break;
                case 15:
                    // R3:
                    for (int j = 15; j < 20; j++) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("r3", cc);
                        if (map == 0)
                            pcom.put("r3", cc);
                    }
                    break;
                case 20:
                    // R4:
                    for (int j = 20; j < 25; j++) {
                        if (table[j] == 42) {
                            ++cc;
                            ++eff;
                        }
                    }
                    if (real) {
                        if (map == 1)
                            bcom.put("r4", cc);
                        if (map == 0)
                            pcom.put("r4", cc);
                    }
                    break;
            }
        }
    }

    // Create random table
    public static int[] rTable() {
        int table[] = new int[25];
        int randomNum;
        for (int j = 0; j < 25; j++) {
            randomNum = rndm.nextInt(25) + 1;
            if (present(table, randomNum))
                continue;
            table[j] = randomNum;
        }
        while (present(table, 0)) {
            for (int j = 0; j < 25; j++) {
                randomNum = rndm.nextInt(25) + 1;
                if (present(table, randomNum))
                    continue;
                table[j] = randomNum;
            }
        }
        return table;
    }

    // Check if a number is present in the table
    public static boolean present(int table[], int num) {
        for (int j = 0; j < table.length; j++) {
            if (table[j] == num) {
                return true;
            }
        }
        return false;
    }

    // Bot BINGO Counter
    public static void bcount() {
        bbingo = 0;
        for (Map.Entry<String, Integer> m : bcom.entrySet()) {
            if (m.getValue() == 5) {
                ++bbingo;
            }
        }
    }

    // Player BINGO Counter
    public static void pcount() {
        pbingo = 0;
        for (Map.Entry<String, Integer> m : pcom.entrySet()) {
            if (m.getValue() == 5) {
                ++pbingo;
            }
        }
    }

    // Bot move
    public static void bot(int table[]) {
        int hV = 0;
        Map<String, Integer> equal = new HashMap<>();
        List<String> prio = new ArrayList<>();
        for (Map.Entry<String, Integer> m : bcom.entrySet()) {
            if (m.getValue() > hV && m.getValue() < 5) {
                hV = m.getValue();
            }
        }
        String sEffL = "";
        for (Map.Entry<String, Integer> m : bcom.entrySet()) {
            if (m.getValue() == hV && m.getValue() < 5) {
                equal.put(m.getKey(), m.getValue());
            }
        }
        String sL[] = equal.keySet().toArray(new String[equal.size()]);
        int cPrio = hir.get(sL[rndm.nextInt(sL.length)]);
        for (Map.Entry<String, Integer> m : hir.entrySet()) {
            switch (m.getKey()) {
                case "d1":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("d1") <= cPrio) {
                            prio.add("d1");
                            cPrio = hir.get("d1");
                        }
                    break;
                case "d2":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("d2") <= cPrio) {
                            prio.add("d2");
                            cPrio = hir.get("d2");
                        }
                    break;
                case "c0":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("c0") <= cPrio) {
                            prio.add("c0");
                            cPrio = hir.get("c0");
                        }
                    break;
                case "c1":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("c1") <= cPrio) {
                            prio.add("c1");
                            cPrio = hir.get("c1");
                        }
                    break;
                case "c2":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("c2") <= cPrio) {
                            prio.add("c2");
                            cPrio = hir.get("c2");
                        }
                    break;
                case "c3":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("c3") <= cPrio) {
                            prio.add("c3");
                            cPrio = hir.get("c3");
                        }
                    break;
                case "c4":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("c4") <= cPrio) {
                            prio.add("c4");
                            cPrio = hir.get("c4");
                        }
                    break;
                case "r0":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("r0") <= cPrio) {
                            prio.add("r0");
                            cPrio = hir.get("r0");
                        }
                    break;
                case "r1":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("r1") <= cPrio) {
                            prio.add("r1");
                            cPrio = hir.get("r1");
                        }
                    break;
                case "r2":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("r2") <= cPrio) {
                            prio.add("r2");
                            cPrio = hir.get("r2");
                        }
                    break;
                case "r3":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("r3") <= cPrio) {
                            prio.add("r3");
                            cPrio = hir.get("r3");
                        }
                    break;
                case "r4":
                    if (equal.containsKey(m.getKey()))
                        if (hir.get("r4") <= cPrio) {
                            prio.add("r4");
                            cPrio = hir.get("r4");
                        }
                    break;
            }
        }
        sEffL = prio.get(rndm.nextInt(prio.size()));
        int ttable[] = table.clone();
        int maxeff = 0;
        int effL = 0;
        switch (sEffL) {
            case "d1":
                maxeff = 0;
                for (int j = 0; j < 25; j += 6) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "d2":
                maxeff = 0;
                for (int j = 4; j < 21; j += 4) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "c0":
                maxeff = 0;
                for (int j = 0; j < 21; j += 5) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "c1":
                maxeff = 0;
                for (int j = 1; j < 22; j += 5) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "c2":
                maxeff = 0;
                for (int j = 2; j < 23; j += 5) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "c3":
                maxeff = 0;
                for (int j = 3; j < 24; j += 5) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "c4":
                maxeff = 0;
                for (int j = 4; j < 25; j += 5) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "r0":
                maxeff = 0;
                for (int j = 0; j < 5; j++) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "r1":
                maxeff = 0;
                for (int j = 5; j < 10; j++) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "r2":
                maxeff = 0;
                for (int j = 10; j < 15; j++) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "r3":
                maxeff = 0;
                for (int j = 15; j < 20; j++) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
            case "r4":
                maxeff = 0;
                for (int j = 20; j < 25; j++) {
                    eff = 0;
                    if (ttable[j] == 42)
                        continue;
                    ttable[j] = 42;
                    cCon(ttable, false, 1);
                    if (eff > maxeff) {
                        maxeff = eff;
                        effL = j;
                    }
                    ttable[j] = table[j];
                }
                break;
        }
        System.out.println("Its Bot's turn. The Bot chooses :" + bTable[effL]);
        for (int i = 0; i < pTable.length; i++) {
            if (pTable[i] == bTable[effL]) {
                pTable[i] = (int) '*';
                break;
            }
        }
        bTable[effL] = (int) '*';

    }

    // Check Bingo
    public static void check() {
        cCon(bTable, true, 1);
        cCon(pTable, true, 0);
        pcount();
        bcount();
        if (pbingo == 5) {
            System.out.println("BINGO!!!!!");
            System.out.println("You won");
            System.exit(0);
        }
        if (bbingo == 5) {
            System.out.println("BINGO!!!!!");
            System.out.println("Bot won");
            System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception {
        App ap = new App();
        bTable = rTable().clone();
        pTable = rTable().clone();
        Scanner in = new Scanner(System.in);
        check();
        System.out.println("========BINGO========");
        int turn = rndm.nextInt(2);
        int choice;
        String input;
        while (true) {
            switch (turn) {
                case 0:
                    choice = 0;
                    System.out.println("Your table :");
                    System.out.println(prTable(pTable));
                    check();
                    System.out.print("Its your turn, enter a number :");
                    input = in.nextLine();
                    try {
                        choice = Integer.parseInt(input);
                        if (!(present(pTable, choice))) {
                            System.out.println("Enter a number that you can see in the table");
                            continue;
                        }
                        for (int i = 0; i < pTable.length; i++) {
                            if (pTable[i] == choice) {
                                pTable[i] = (int) '*';
                                for (int j = 0; j < bTable.length; j++) {
                                    if (bTable[j] == choice) {
                                        bTable[j] = (int) '*';
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        System.out.println(prTable(pTable));
                        turn = 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a number that you can see in the table");
                        continue;
                    }
                    break;
                case 1:
                    check();
                    bot(bTable);
                    turn = 0;
            }
        }
    }
}
