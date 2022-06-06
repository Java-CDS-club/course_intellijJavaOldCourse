public class PaintJob
{
        public static int getBucketCount(double width , double height , double areaPerbucket , int extraBuckets)
        {
            if (width <= 0 || height <= 0 || areaPerbucket <=0 || extraBuckets < 0) return -1;
            return ((int)(Math.ceil((width*height)/areaPerbucket))-extraBuckets );
        }
      public static int getBucketCount(double width , double height , double areaPerbucket )
      {
        if (width <= 0 || height <= 0 || areaPerbucket <=0 ) return -1;
          return ((int)(Math.ceil((width*height)/areaPerbucket)));
      }
    public static int getBucketCount(double area , double areaPerbucket )
    {
        if ( area <= 0 || areaPerbucket <=0 ) return -1;
        return ((int)(Math.ceil((area)/areaPerbucket)) );
    }
}