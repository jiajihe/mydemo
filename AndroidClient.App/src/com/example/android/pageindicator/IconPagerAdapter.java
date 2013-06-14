/**
 * ��Ϊ��Դ��ĿJakeWharton-Android-ViewPagerIndicator�еĴ���
 */
package com.example.android.pageindicator;

public interface IconPagerAdapter {
	
	// From PagerAdapter
    int getCount();
    
    CharSequence getPageTitle(int position);
	
    /**
     * Get icon representing the page at {@code index} in the adapter.
     */
    int getIconResId(int index);
   
}