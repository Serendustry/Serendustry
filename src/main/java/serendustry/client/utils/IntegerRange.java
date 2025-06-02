package serendustry.client.utils;

import org.eclipse.xtext.xbase.lib.Pure;

import java.util.ListIterator;
import java.util.NoSuchElementException;

// For some reason, Intellij can't find any other impl of IntegerRange
public class IntegerRange implements Iterable<Integer> {

    private final int start;
    private final int end;
    private final int step;

    @Pure
    public ListIterator<Integer> iterator() {
        return new RangeIterator();
    }

    @Pure
    public IntegerRange(int start, int end) {
        this(start, end, end >= start ? 1 : -1);
    }

    @Pure
    public IntegerRange(int start, int end, int step) {
        if ((start >= end || step >= 0) && (start <= end || step <= 0)) {
            if (step == 0) {
                throw new IllegalArgumentException("The step of an IntegerRange must not be 0");
            } else {
                this.start = start;
                this.end = end;
                this.step = step;
            }
        } else {
            throw new IllegalArgumentException("The step of an IntegerRange must have the correct sign.");
        }
    }

    @Pure
    public int getStart() {
        return this.start;
    }

    @Pure
    public int getStep() {
        return this.step;
    }

    @Pure
    public int getEnd() {
        return this.end;
    }

    @Pure
    public int getSize() {
        return (this.end - this.start) / this.step + 1;
    }

    @Pure
    public IntegerRange withStep(int step) {
        return new IntegerRange(this.start, this.end, step);
    }

    @Pure
    public boolean contains(int number) {
        if (this.step < 0) {
            return number <= this.start && number >= this.end && (number - this.start) % this.step == 0;
        } else {
            return number >= this.start && number <= this.end && (number - this.start) % this.step == 0;
        }
    }

    private class RangeIterator implements ListIterator<Integer> {

        private int next;
        private int nextIndex;

        private RangeIterator() {
            this.next = IntegerRange.this.start;
            this.nextIndex = 0;
        }

        public boolean hasNext() {
            if (IntegerRange.this.step < 0) {
                return this.next >= IntegerRange.this.end;
            } else {
                return this.next <= IntegerRange.this.end;
            }
        }

        public Integer next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            } else {
                int value = this.next;
                this.next += IntegerRange.this.step;
                ++this.nextIndex;
                return value;
            }
        }

        public boolean hasPrevious() {
            return this.nextIndex > 0;
        }

        public Integer previous() {
            if (this.nextIndex <= 0) {
                throw new NoSuchElementException();
            } else {
                --this.nextIndex;
                this.next -= IntegerRange.this.step;
                return this.next;
            }
        }

        public int nextIndex() {
            return this.nextIndex;
        }

        public int previousIndex() {
            return this.nextIndex - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Cannot remove elements from a Range");
        }

        public void set(Integer e) {
            throw new UnsupportedOperationException("Cannot set elements in a Range");
        }

        public void add(Integer e) {
            throw new UnsupportedOperationException("Cannot add elements to a Range");
        }
    }
}
