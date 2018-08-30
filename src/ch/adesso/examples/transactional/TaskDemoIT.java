package ch.adesso.examples.transactional;

/*
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.born.tecnet.core.config.IntegrationTestConfig;


@ContextConfiguration(classes = { IntegrationTestConfig.class })
@RunWith(SpringJUnit4ClassRunner.class)
*/
public class TaskDemoIT {

	/*
    @Autowired
    private TaskDemo taskDemo;

    @Autowired
    private TaskRepository taskRepository;


    @After
    public void cleanUp() {
        taskRepository.deleteAll();
    }

    @Test
    public void save() {
        try {
            taskDemo.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(taskRepository.findByName("TEST"));
    }

    @Test
    public void saveThrowsNullPointerException() {
        try {
            taskDemo.saveThrowsNullPointerException();
        } catch (Exception e) {
        }
        assertNull(taskRepository.findByName("TEST"));
    }

    @Test
    public void saveThrowsException() {
        try {
            taskDemo.saveThrowsException();
        } catch (Exception e) {
        }
        assertNull(taskRepository.findByName("TEST"));
    }

    @Test
    public void saveTransactional() {
        try {
            taskDemo.saveTransactional();
        } catch (Exception e) {
        }
        assertNotNull(taskRepository.findByName("TEST"));
    }

    @Test
    public void saveTransactionalThrowsNullPointerException() {
        try {
            taskDemo.saveTransactionalThrowsNullPointerException();
        } catch (Exception e) {
        }
        assertNull(taskRepository.findByName("TEST"));
    }

    @Test
    public void saveTransactionalThrowsException() {
        try {
            taskDemo.saveTransactionalThrowsException();
        } catch (Exception e) {
        }
        assertNull(taskRepository.findByName("TEST"));
    }

    @Test
    public void callSave() {
        try {
            taskDemo.callSave();
        } catch (Exception e) {
        }
        assertNull(taskRepository.findByName("TEST"));
    }
	 */
	
}
