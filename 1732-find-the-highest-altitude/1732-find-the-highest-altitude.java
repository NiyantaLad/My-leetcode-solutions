class Solution {
  public int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    // Highest altitude currently is 0.
    int highestPoint = currentAltitude;

    for (int altitudeGain : gain) {
      // Adding the gain in altitude to the current altitude.
      currentAltitude += altitudeGain;
      // Update the highest altitude.
      highestPoint = Math.max(highestPoint, currentAltitude);
    }

    return highestPoint;
  }
}
// class Solution {
//     public int largestAltitude(int[] gain) {
//         int maxAltitude=gain[0];
//         for(int i=1;i<gain.length;i++){
//             gain[i]=gain[i]+gain[i-1];
//             maxAltitude = Math.max(maxAltitude,gain[i]);
//         }
//         return Math.max(0,maxAltitude);
//     }
// }