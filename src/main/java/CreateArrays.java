import java.util.*;

/*Необходимо сгенерировать n-массивов, заполнить их случайными числами, каждый массив имеет случайный размер.
Размеры массивов не должны совпадать.
Далее необходимо отсортировать массивы.
Массивы с четным порядковым номером отсортировать по возрастанию, с нечетным порядковым номером - по убыванию.
На выходе функция должна вернуть массив с отсортированными массивами.*/
public class CreateArrays {
    // метод возвращает массив с отсортированными массивами
    public Integer[][] createArrays(int n){
        int iter = 0;
        Integer [][] arrayOfArrays = new Integer[n][];//массов массивов
        Set<Integer> randoms = new HashSet<>(n); //случайные неповторяющиеся размеры для массивов
        while (randoms.size() < n) {
            randoms.add((int) ( Math.random() * n * n) + 1);
        }
        for (Iterator<Integer> it = randoms.iterator(); it.hasNext(); ) {
            int f = it.next();
            Integer[] array = new Integer[f];
            for (int i = 0; i < array.length; i++){
                array[i] = (int) ( Math.random() * 2147483 * 2 + 1 ) - 2147483;
            }
            // нумерация массивов начинается с нуля
            //если четный порядковый номер, то отсортировать по возрастанию
            if (iter % 2 == 0) Arrays.sort(array);
            //если нечетный порядковый номер, то отсортировать по убыванию
            else Arrays.sort(array, Collections.reverseOrder());
            arrayOfArrays[iter] = array;
            iter++;
        }
        return arrayOfArrays;
    }
}
