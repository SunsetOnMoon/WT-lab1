package task13.model;

import java.util.Objects;

public class ProgrammerBook  extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        ProgrammerBook pBook =(ProgrammerBook) obj;
        return level == pBook.level && Objects.equals(language, pBook.language);
    }

    @Override
    public int hashCode()
    {
        final int prime = 29;
        int result = super.hashCode();

        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + level;
        return result;
    }
}
