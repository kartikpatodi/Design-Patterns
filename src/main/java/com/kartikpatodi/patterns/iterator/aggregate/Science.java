package com.kartikpatodi.patterns.iterator.aggregate;

import com.kartikpatodi.patterns.iterator.iter.IIterator;

import java.util.ArrayList;

public class Science implements ISubject {

    ArrayList<String> subjects;

    public Science() {
        subjects = new ArrayList<>();
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Maths");
    }

    public Science(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public IIterator createIterator() {
        return new ScienceIterator(subjects);
    }

    private class ScienceIterator implements IIterator<String> {

        private ArrayList<String> subjects;
        private int position;

        public ScienceIterator(ArrayList<String> subjects) {
            this.subjects = subjects;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects.get(position++);
        }

        @Override
        public boolean isDone() {
            return position >= subjects.size();
        }

        @Override
        public String currentItem() {
            return subjects.get(position);
        }
    }
}
