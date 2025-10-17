package group2.Sorter;
public class BubbleSort extends Sorter {
    @Override
    public void sort() {
      int[]arr = getArray();
      int n = arr.length;

      for (int i = 0; i < n-1; i++) {
          for (int j = 0; j < n-1-i; j++) {
              if (arr[j] > arr[j+1]) {
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }
      }
      setArray(arr);
    }
}

// võtan massiivi, nt 64, 34, 25, 12, 22, 11, 90, mille sain getArray meetodiga
// võtan massiivi pikkuse ning salvestan selle muutujasse n
// teen kaks tsüklit, esimene tsükkel jookseb i muutujaga 0-st n-1-ni
// teine tsükkel jookseb j muutujaga 0-st n-1-i-ni
// teises tsüklis võrdlen kahte järjestikust elementi, kui esimene on suurem kui teine, siis vahetan need
// vahetan nii, et teen ajutise muutuja temp, kuhu salvestan esimese elemendi väärtuse
// seejärel annan esimesele elemendile teise elemendi väärtuse
// lõpuks annan teisele elemendile ajutise muutuja väärtuse
// nii jätkan, kuni kogu massiiv on sorteeritud
// lõpuks kasutan setArray meetodit, et salvestada sorteeritud massiiv tagasi