var employeeApi = Vue.resource('/employee/filter');

Vue.component ('employee-row', {
    prop: [employee],
    template: '<div><i>({{ employee.id }})</i> {{employee.personNumber}}</div> '
});

// Define a new component called todo-item
Vue.component('employees-list', {
    prop: ['employees'],
    template: '<div>' +
        '<employee-row v-for="employee in employees" :key="employee.id" :employee="employee"  />' +
        '</div>',
    created: function () {
        employeeApi.get().then(result =>
            result.json.then(data =>
                data.forEach(employee => this.employees.push(employee))
            )
        )
    }
});


var app = new Vue({
    el: '#app',
    template: '<employees-list :employees="employees"/>',
    data: {
        employees: []
    }
});