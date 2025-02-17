package diary;

import entry.Entry;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries = new ArrayList<>();
    private int nextEntryId = 1;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            this.isLocked = false;
        } else {
            throw new IllegalArgumentException("Incorrect password.");
        }
    }

    public void createEntry(String title, String body) {
        if (isLocked) throw new IllegalStateException("Diary is locked.");
        entries.add(new Entry(nextEntryId++, title, body));
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        Entry entry = findEntryById(id);
        if (entry != null) {
            entry.setTitle(newTitle);
            entry.setBody(newBody);
        } else {
            throw new IllegalArgumentException("Entry not found.");
        }
    }

    public void deleteEntry(int id) {
        Entry entry = findEntryById(id);
        if (entry != null) {
            entries.remove(entry);
        } else {
            throw new IllegalArgumentException("Entry not found.");
        }
    }

    public List<Entry> getEntries() {
        return entries;
    }
}
