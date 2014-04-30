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
}
