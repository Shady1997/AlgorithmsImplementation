package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class GreedySearch {

    //In computer science, the greedy algorithm is an algorithm that follows the problem-solving heuristic of making the locally optimal choice at each stage with the hope of finding a global optimum.
    //
    //Here is an example of a greedy algorithm in Java that solves the fractional knapsack problem:
    //This function takes in an array of weights, an array of values, and a capacity, and returns the maximum value that can be obtained by choosing a subset of the items such that the total weight does not exceed the capacity. The algorithm works by sorting the items in decreasing order of value-to-weight ratio, and then iteratively selecting the items with the highest ratio until the capacity is reached.
    public double getMaxValue(int[] weights, int[] values, int capacity) {
        Item[] items = new Item[weights.length];
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item(weights[i], values[i]);
        }
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item i1, Item i2) {
                double valuePerWeight1 = (double) i1.value / i1.weight;
                double valuePerWeight2 = (double) i2.value / i2.weight;
                return Double.compare(valuePerWeight2, valuePerWeight1);
            }
        });
        double value = 0;
        for (Item item : items) {
            int weight = item.weight;
            int val = item.value;
            if (capacity - weight >= 0) {
                capacity -= weight;
                value += val;
            } else {
                value += val * ((double) capacity / weight);
                break;
            }
        }
        return value;
    }

    private static class Item {
        int weight;
        int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

}
