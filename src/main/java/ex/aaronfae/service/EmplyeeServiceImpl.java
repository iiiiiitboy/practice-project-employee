package ex.aaronfae.service;

import ex.aaronfae.dao.EmployeeMapper;
import ex.aaronfae.entity.Employee;
import ex.aaronfae.entity.EmployeeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmplyeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> list = employeeMapper.selectAllEmployee();
        return list;
    }

    public List<Employee> employeeList() {
        EmployeeExample employeeExample = new EmployeeExample();
        return employeeMapper.selectByExample(employeeExample);
    }

    @Override
    public Employee editEmployee(Integer e_id) {
        return employeeMapper.selectByPrimaryKey(e_id);
    }

}
