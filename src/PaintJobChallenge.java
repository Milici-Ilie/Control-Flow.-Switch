public class PaintJobChallenge {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.45, 2.49, 1.5, 1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double remainingArea = area - extraBuckets * areaPerBucket;
        return getBucketCount(remainingArea, areaPerBucket);// calling the method from bellow and implementing our values
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double numberOfBuckets = area / areaPerBucket;
        return (int) Math.ceil(numberOfBuckets);
    }
}
