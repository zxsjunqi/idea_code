package com.example.springboot.service;
import com.example.springboot.bean.Count;
import com.example.springboot.manager.springbootManager;
import org.springframework.stereotype.Service;

@Service
public class springbootService {
    public void addCount(Count count){
                 if (count != null){
                     springbootManager.getInstance().addCount(count.getCount());
                     }
             }

             public void minusCount(Count count){
                 if (count != null) {
                     springbootManager.getInstance().minusCount(count.getCount());
                     }
             }

             public Count getCount()
     {
                 Count count = new Count();
                count.setCount(springbootManager.getInstance().getCount());
                 return count;
             }

             public void initCount(Count count){
                 if (count != null) {
                     springbootManager.getInstance().initCount(count.getCount());
                     }
             }
}
