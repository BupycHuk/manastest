package searchtools;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

/**
 * ���� ����� ������������ ��� ���������� ������ ������
 *
 * @author �������� ��������
 * http://www.vova-prog.narod.ru
 */
public class FileSorter implements Comparator {
    
    Pattern p = null;
    Collator collator = null;
    
    /** ������� ����� ���������� FileSorter */
    public FileSorter() {
        .
        .
        .
    }

    /* ���� ����� ��������� ��������� ���� ���� ������.
     * ����������:
     *     1 ���� ������ �������� (�1) ������ ������� (�2),
     *    -1 ���� ������ �������� (�1) ������ ������� (�2),
     *     0 ���� ��� �����.
     * ��� ������� ����� ��������� ������ ������� �����, ����
     * ������ ���� ��������� ����� � ����� ������ �����.
     * ���� ����� ��������� � ����� �����, �� ������ �� ���,
     * ������� ���� ������ �� ��������.
     */
    public int compare(Object o1, Object o2) {
        .
        .
        .
    }
    
    public List sort(List fileList) {
        ArrayList res = new ArrayList(fileList.size());
        res.addAll(fileList);
        Collections.sort(res, this);
        return res;
    }
}