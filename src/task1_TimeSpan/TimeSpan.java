package task1_TimeSpan;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        // minutes < 60
        if (minutes > 59) {
            throw new IllegalArgumentException("Минуты не должны привышать значение 59");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        int time = this.minutes + this.hours * 60 + (timeSpan.getMinutes() + timeSpan.getHours() * 60);
        changingTheTimeFormat(time);
    }

    private void changingTheTimeFormat(int time) {
        this.setMinutes(time % 60);
        this.setHours(time / 60);
    }

    public void sub(TimeSpan timeSpan) {
        int time = this.minutes + this.hours * 60 - (timeSpan.getMinutes() + timeSpan.getHours() * 60);
        if (time < 0) {
            throw new IllegalArgumentException("Ошибка. Отрицательное значение времени!");
        } else {
            changingTheTimeFormat(time);
        }
    }

    public void mult(double times) {
        int time = (int) ((this.minutes + this.hours * 60) * times);
        changingTheTimeFormat(time);
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
