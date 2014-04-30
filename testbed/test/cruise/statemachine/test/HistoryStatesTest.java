package cruise.statemachine.test;

import org.junit.Assert;
import org.junit.Test;

public class HistoryStatesTest
{
  @Test
  public void SimpleHistoryState()
  {
    HistoryCourse course = new HistoryCourse();
    course.toss2();
    Assert.assertEquals(HistoryCourse.SmS1.Ss2, course.getSmS1());
    course.tos2();
    course.toHistory();
    Assert.assertEquals(HistoryCourse.SmS1.Ss2, course.getSmS1());
  }
  
  @Test
  public void SimpleDeepHistoryState()
  {
    DeepHistoryCourse course = new DeepHistoryCourse();
    course.toSs2Sss2();
    course.toSsss2();
    course.toS2();
    course.toDeepHistory();
    System.out.println("After to deepH, SmS1 = " + course.getSmS1());
    Assert.assertEquals(DeepHistoryCourse.SmS1.Ss2, course.getSmS1());
    Assert.assertEquals(DeepHistoryCourse.SmS1Ss2.Sss2, course.getSmS1Ss2());
    Assert.assertEquals(DeepHistoryCourse.SmS1Ss2Sss2.Ssss2, course.getSmS1Ss2Sss2());
  }
}
