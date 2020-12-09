package com.example.demo.Service;

import com.example.demo.dto.BookingInfo;
import com.example.demo.dto.RestaurantTable;
import com.example.demo.dto.Role;
import com.example.demo.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookedTableService {
    private final List<BookingInfo> bookingInfos = new ArrayList<>();

    public BookedTableService() {
        Role Admin = new Role(1L, "Admin");
        Role Waiter = new Role(2L, "Waiter");
        Role Customer = new Role(3L, "Customer");

        User brian = new User(1L, "Brian", "Clozel", "bclozel@pivotal.io", "123",Admin);
        User rossen = new User(3L, "Rossen", "Stoyanchev", "rstoyanchev@pivotal.io", "32456",Customer);

        RestaurantTable T1 = new RestaurantTable(1L,"4 seat" ,"Four people Only",brian,"Available",Waiter);
        RestaurantTable T2 = new RestaurantTable(2L, "2 seat round","Two people can sit",brian,"Available",Waiter);
        RestaurantTable T3 = new RestaurantTable(3L,"1 seat","One person can sit",brian,"Available",Waiter);
        BookingInfo B1 = new BookingInfo(1L,T1 ,rossen,"4" ,"Processing");
        bookingInfos.add(B1);
    }
    public List<BookingInfo> findAll() {
        return bookingInfos;
    }

    public BookingInfo findById(Long id) {
        return this.bookingInfos.stream().filter((m) -> m.getBookingId() == id).findFirst().get();
    }

    public BookingInfo create(BookingInfo bookingInfo) {
            this.bookingInfos.add(bookingInfo);
            return bookingInfo; }
}
