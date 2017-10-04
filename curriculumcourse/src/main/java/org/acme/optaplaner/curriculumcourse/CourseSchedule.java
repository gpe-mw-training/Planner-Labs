package org.acme.optaplaner.curriculumcourse;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CourseSchedule implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Course List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Course> courseList;
   @org.kie.api.definition.type.Label(value = "Curriculum List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Curriculum> curriculumList;
   @org.kie.api.definition.type.Label(value = "Day List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Day> dayList;
   @org.kie.api.definition.type.Label(value = "Id")
   private java.lang.Long id;
   @org.kie.api.definition.type.Label(value = "Lecture List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Lecture> lectureList;
   @org.kie.api.definition.type.Label(value = "Couser Schedule Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "Period List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Period> periodList;
   @org.kie.api.definition.type.Label(value = "Room List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Room> roomList;
   @org.kie.api.definition.type.Label(value = "Teacher List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Teacher> teacherList;
   @org.kie.api.definition.type.Label(value = "Timeslot List")
   private java.util.List<org.acme.optaplaner.curriculumcourse.Timeslot> timeslotList;

   public CourseSchedule()
   {
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Course> getCourseList()
   {
      return this.courseList;
   }

   public void setCourseList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Course> courseList)
   {
      this.courseList = courseList;
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Curriculum> getCurriculumList()
   {
      return this.curriculumList;
   }

   public void setCurriculumList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Curriculum> curriculumList)
   {
      this.curriculumList = curriculumList;
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Day> getDayList()
   {
      return this.dayList;
   }

   public void setDayList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Day> dayList)
   {
      this.dayList = dayList;
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Lecture> getLectureList()
   {
      return this.lectureList;
   }

   public void setLectureList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Lecture> lectureList)
   {
      this.lectureList = lectureList;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Period> getPeriodList()
   {
      return this.periodList;
   }

   public void setPeriodList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Period> periodList)
   {
      this.periodList = periodList;
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Room> getRoomList()
   {
      return this.roomList;
   }

   public void setRoomList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Room> roomList)
   {
      this.roomList = roomList;
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Teacher> getTeacherList()
   {
      return this.teacherList;
   }

   public void setTeacherList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Teacher> teacherList)
   {
      this.teacherList = teacherList;
   }

   public java.util.List<org.acme.optaplaner.curriculumcourse.Timeslot> getTimeslotList()
   {
      return this.timeslotList;
   }

   public void setTimeslotList(
         java.util.List<org.acme.optaplaner.curriculumcourse.Timeslot> timeslotList)
   {
      this.timeslotList = timeslotList;
   }

   public CourseSchedule(
         java.util.List<org.acme.optaplaner.curriculumcourse.Course> courseList,
         java.util.List<org.acme.optaplaner.curriculumcourse.Curriculum> curriculumList,
         java.util.List<org.acme.optaplaner.curriculumcourse.Day> dayList,
         java.lang.Long id,
         java.util.List<org.acme.optaplaner.curriculumcourse.Lecture> lectureList,
         java.lang.String name,
         java.util.List<org.acme.optaplaner.curriculumcourse.Period> periodList,
         java.util.List<org.acme.optaplaner.curriculumcourse.Room> roomList,
         java.util.List<org.acme.optaplaner.curriculumcourse.Teacher> teacherList,
         java.util.List<org.acme.optaplaner.curriculumcourse.Timeslot> timeslotList)
   {
      this.courseList = courseList;
      this.curriculumList = curriculumList;
      this.dayList = dayList;
      this.id = id;
      this.lectureList = lectureList;
      this.name = name;
      this.periodList = periodList;
      this.roomList = roomList;
      this.teacherList = teacherList;
      this.timeslotList = timeslotList;
   }

}