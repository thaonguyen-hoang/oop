package oop.lab07.countrymanager;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }
        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < length - 1; i++) {
            int jMin = i;
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getPopulation() > newArray[j].getPopulation()) {
                    jMin = j;
                }
            }
            if (jMin != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[jMin];
                newArray[jMin] = temp;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < length - 1; i++) {
            int jMax = i;
            for (int j = i + 1; j < length; j++) {
                if (newArray[i].getPopulation() < newArray[j].getPopulation()) {
                    jMax = j;
                }
            }
            if (jMax != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[jMax];
                newArray[jMax] = temp;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int len = length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < len; i++) {
                if (newArray[i - 1].getArea() > newArray[i].getArea()) {
                    Country temp = newArray[i - 1];
                    newArray[i - 1] = newArray[i];
                    newArray[i] = temp;
                    swapped = true;
                }
            }
            len = len - 1;
        } while (swapped);

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int len = length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < len; i++) {
                if (newArray[i - 1].getArea() < newArray[i].getArea()) {
                    Country temp = newArray[i - 1];
                    newArray[i - 1] = newArray[i];
                    newArray[i] = temp;
                    swapped = true;
                }
            }
            len = len - 1;
        } while (swapped);

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (newArray[j - 1].getGdp() > newArray[j].getGdp()) {
                    Country temp = newArray[j - 1];
                    newArray[j - 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (newArray[j - 1].getGdp() < newArray[j].getGdp()) {
                    Country temp = newArray[j - 1];
                    newArray[j - 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] africaCountries = new AfricaCountry[length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[index] = (AfricaCountry) country;
                index++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        ArrayList<Country> listOfAsiaCountries = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                listOfAsiaCountries.add(country);
            }
        }
        AsiaCountry[] asiaCountries = new AsiaCountry[listOfAsiaCountries.size()];
        return listOfAsiaCountries.toArray(asiaCountries);
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] europeCountries = new EuropeCountry[length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[index] = (NorthAmericaCountry) country;
                index++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries[index] = (OceaniaCountry) country;
                index++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[index] = (SouthAmericaCountry) country;
                index++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        return Arrays.copyOf(sortByDecreasingPopulation(), howMany);
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] leastPopulous = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            leastPopulous[i] = sortByIncreasingPopulation()[i];
        }
        return leastPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] largestArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestArea[i] = sortByDecreasingArea()[i];
        }
        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] smallestArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            smallestArea[i] = sortByIncreasingArea()[i];
        }
        return smallestArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] highestGDP = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highestGDP[i] = sortByDecreasingGdp()[i];
        }
        return highestGDP;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] lowestGDP = new Country[countries.length];
        for (int i = 0; i < howMany; i++) {
            lowestGDP[i] = sortByIncreasingGdp()[i];
        }
        return lowestGDP;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (Country country : countries) {
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (Country country : countries) {
            if (country != null) {
                countriesString.append(country).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
