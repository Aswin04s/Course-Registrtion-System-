function availCourses() {
    fetch("http://localhost:8080/courses")
        .then((response) => response.json())
        .then((courses) => {
            var dataTable = document.getElementById("courseTable");
            courses.forEach(course => {
                var row = `<tr>
          <td class="px-6 py-3">${course.courseId}</td>
          <td class="px-6 py-3">${course.courseName}</td>
          <td class="px-6 py-3">${course.trainer}</td>
          <td class="px-6 py-3">${course.durationInWeeks}</td>
        </tr>`;
                dataTable.innerHTML += row;
            });
        });
}

function regStudents() {
    fetch("http://localhost:8080/courses/enrolled")
        .then((response) => response.json())
        .then((students) => {
            var dataTable = document.getElementById("studentsTable");
            students.forEach(student => {
                var row = `<tr>
          <td class="px-6 py-3">${student.name}</td>
          <td class="px-6 py-3">${student.emailId}</td>
          <td class="px-6 py-3">${student.courseName}</td>
        </tr>`;
                dataTable.innerHTML += row;
            });
        });
}


window.onload = function () {
    if (document.getElementById("courseTable")) {
        availCourses();
    }
    if (document.getElementById("studentsTable")) {
        regStudents();
    }
};
