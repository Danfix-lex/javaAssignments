package mainapplication;

import javax.swing.*;
import diaries.Diaries;
import diary.Diary;
import entry.Entry;
public class MainApplication {
    private Diaries diaries = new Diaries();

    public static void main(String[] args) {
        MainApplication app = new MainApplication();
        app.run();
    }

    public void run() {
        while (true) {
            String optionStr = JOptionPane.showInputDialog(
                    "Welcome to the Danfix's Diary Application\n" +
                            "1. Create Diary\n" +
                            "2. Lock Diary\n" +
                            "3. Unlock Diary\n" +
                            "4. Create Entry\n" +
                            "5. View Entries\n" +
                            "6. Update Entry\n" +
                            "7. Delete Entry\n" +
                            "8. Delete Diary\n" +
                            "9. Exit\n" +
                            "Enter your choice:"
            );

            try {
                int option = Integer.parseInt(optionStr);
                processOption(option);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
            finally {
                run();
            }
        }
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                createDiary();
                break;
            case 2:
                lockDiary();
                break;
            case 3:
                unlockDiary();
                break;
            case 4:
                createEntry();
                break;
            case 5:
                viewEntries();
                break;
            case 6:
                updateEntry();
                break;
            case 7:
                deleteEntry();
                break;
            case 8:
                deleteDiary();
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Thank you for using Danfix's Diary Application!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
        }
    }

    private void createDiary() {
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");
        diaries.add(username, password);
        JOptionPane.showMessageDialog(null, "Your Diary has been created successfully!");
    }

    private void lockDiary() {
        String username = JOptionPane.showInputDialog("Enter the username of your diary to lock:");
        Diary diary = diaries.findByUsername(username);
        if (diary != null) {
            diary.lockDiary();
            JOptionPane.showMessageDialog(null, "Your Diary has been locked successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found.");
        }
    }

    private void unlockDiary() {
        String username = JOptionPane.showInputDialog("Enter the username of your diary to unlock:");
        Diary diary = diaries.findByUsername(username);
        if (diary != null) {
            String password = JOptionPane.showInputDialog("Enter your password:");
            try {
                diary.unlockDiary(password);
                JOptionPane.showMessageDialog(null, "Your Diary has been unlocked successfully!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            finally {
                run();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found.");
        }
    }

    private void createEntry() {
        String username = JOptionPane.showInputDialog("Enter the username of your diary:");
        Diary diary = diaries.findByUsername(username);
        if (diary != null) {
            if (diary.isLocked()) {
                JOptionPane.showMessageDialog(null, "Your Diary is locked. Unlock it first.");
                return;
            }
            String title = JOptionPane.showInputDialog("Enter your entry title:");
            String body = JOptionPane.showInputDialog("Enter your entry body:");
            diary.createEntry(title, body);
            JOptionPane.showMessageDialog(null, "Your Entry has been created successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found.");
        }
    }

    private void viewEntries() {
        String username = JOptionPane.showInputDialog("Enter the username of your diary:");
        Diary diary = diaries.findByUsername(username);
        if (diary != null) {
            StringBuilder entries = new StringBuilder();
            for (Entry entry : diary.getEntries()) {
                entries.append("ID: ").append(entry.getId())
                        .append(", Title: ").append(entry.getTitle())
                        .append(", Body: ").append(entry.getBody())
                        .append(", Date: ").append(entry.getDateCreated())
                        .append("\n");
            }
            JOptionPane.showMessageDialog(null, entries.length() > 0 ? entries.toString() : "No entries found.");
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found.");
        }
    }

    private void updateEntry() {
        String username = JOptionPane.showInputDialog("Enter the username of your diary:");
        Diary diary = diaries.findByUsername(username);
        if (diary != null) {
            if (diary.isLocked()) {
                JOptionPane.showMessageDialog(null, "Your Diary has been locked. Unlock it first.");
                return;
            }
            int entryId = Integer.parseInt(JOptionPane.showInputDialog("Enter your entry ID:"));
            String newTitle = JOptionPane.showInputDialog("Enter your new title:");
            String newBody = JOptionPane.showInputDialog("Enter your new body:");
            try {
                diary.updateEntry(entryId, newTitle, newBody);
                JOptionPane.showMessageDialog(null, "Entry updated successfully!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            finally {
                run();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found.");
        }
    }

    private void deleteEntry() {
        String username = JOptionPane.showInputDialog("Enter the username of your diary:");
        Diary diary = diaries.findByUsername(username);
        if (diary != null) {
            if (diary.isLocked()) {
                JOptionPane.showMessageDialog(null, "Your Diary has been locked. Unlock it first.");
                return;
            }
            int entryId = Integer.parseInt(JOptionPane.showInputDialog("Enter your entry ID:"));
            try {
                diary.deleteEntry(entryId);
                JOptionPane.showMessageDialog(null, "Your Entry deleted successfully!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            finally {
                run();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Diary not found.");
        }
    }

    private void deleteDiary() {
        String username = JOptionPane.showInputDialog("Enter the username of your diary:");
        String password = JOptionPane.showInputDialog("Enter your password:");
        try {
            diaries.delete(username, password);
            JOptionPane.showMessageDialog(null, "Your Diary has been deleted successfully!");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally {
            run();
        }
    }
}
